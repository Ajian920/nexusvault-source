# -*- coding: utf-8 -*-
import webview
import os
import sys

def get_resource_path(relative_path):
    if hasattr(sys, '_MEIPASS'):
        return os.path.join(sys._MEIPASS, relative_path)
    return os.path.join(os.path.dirname(os.path.abspath(__file__)), relative_path)

def main():
    html_path = get_resource_path('www/index.html')
    icon_path = get_resource_path('icon.ico')
    
    window = webview.create_window(
        title='资源共享',
        url=html_path,
        width=1200,
        height=800,
        min_size=(380, 600),
        background_color='#0a0a12',
        resizable=True,
        text_select=True
    )
    
    webview.start(debug=False, icon=icon_path)

if __name__ == '__main__':
    main()
