# -*- coding: utf-8 -*-
"""
NexusVault Desktop - EXE启动器
依赖: pip install pywebview
打包: pyinstaller --onefile --noconsole --icon=icon.ico --add-data "index.html;." app.py
"""
import webview
import sys
import os

def get_path(filename):
    if getattr(sys, 'frozen', False):
        base = sys._MEIPASS
    else:
        base = os.path.dirname(os.path.abspath(__file__))
    return os.path.join(base, filename)

def main():
    webview.create_window(
        title="NexusVault - 资源合集分享",
        url=get_path("index.html"),
        width=1000,
        height=750,
        min_size=(800, 600),
        resizable=True,
        text_select=True,
    )
    webview.start(gui="edgechromium", debug=False)

if __name__ == "__main__":
    main()
