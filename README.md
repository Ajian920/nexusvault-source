# 📦 资源共享 v2.0

一站式资源合集分享工具，支持 PC 端和 Android 端。

## ✨ 功能特性

- 🌐 在线访问 / 📱 离线访问 双模式
- 🎨 炫酷霓虹风格 UI
- 📂 资源分类浏览
- 🔍 资源搜索
- 📱 响应式设计，适配各种屏幕

## 📥 下载安装

### Android
下载 `成品/Android/资源共享.apk` 安装到手机即可使用。

### PC (Windows)
下载 `成品/PC便携版/资源共享.exe` 双击即可运行，无需安装。

## 📁 项目结构

```
资源共享_GitHub/
├── 成品/
│   ├── Android/          # Android APK 安装包
│   └── PC便携版/          # Windows 便携版 exe
├── 源码/
│   ├── 前端/              # 前端页面源码
│   ├── 电脑端/            # PC 端源码 (Python + pywebview)
│   ├── 手机端/            # Android 源码 (Capacitor)
│   └── 构建工具/          # 图标资源
├── .gitignore
└── README.md
```

## 🛠️ 开发环境

### PC 端
- Python 3.10+
- 依赖安装: `pip install pywebview pyinstaller`
- 运行: `python app.py`
- 打包: `pyinstaller --noconfirm --onefile --windowed --name "资源共享" --icon "icon.ico" --add-data "www;www" --add-data "icon.ico;." --clean app.py`

### Android 端
- Java JDK 21+
- Android SDK
- Node.js + npm
- 依赖安装: `cd 源码/电脑端 && npm install`
- 同步: `npx cap sync android`
- 构建: `cd android && gradle assembleDebug`

## 📝 更新日志

### v2.0 (2026-08-02)
- ✅ 新增在线/离线双模式访问
- ✅ 在线内容应用内打开（不跳转浏览器）
- ✅ PC 端使用 Python + pywebview，体积仅 29MB
- ✅ 统一 PC 和 Android 图标
- ✅ 优化 UI 交互体验

## 📄 许可证

MIT License

## 👨‍💻 作者

阿建整理
