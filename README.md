# NexusVault - 资源合集分享工具

## 版本
- 当前版本: v3.0.0
- 包名: com.nexusvault.v3

## 文件说明

### 核心
- `index.html` - 主页面（赛博朋克风格）

### EXE 桌面版
- `exe源码.py` - Python 启动器 (pywebview)
- 依赖: `pip install pywebview`
- 打包: `pyinstaller --onefile --noconsole --icon=icon.ico --add-data "index.html;." exe源码.py`

### APK 安卓版
- `MainActivity.java` - Android 主活动（清缓存 + 在线加载）
- `capacitor.config.json` - Capacitor 配置
- `styles.xml` - Android 主题

### 在线更新
- 通过 GitHub Releases API 自动检测新版本
- APK/EXE 自动识别平台下载

### 编译 APK
1. `npm init -y && npm install @capacitor/core @capacitor/cli @capacitor/android`
2. `mkdir www && cp index.html www/`
3. `npx cap add android`
4. 替换 MainActivity.java 和 styles.xml
5. `npx cap sync android && cd android && gradlew clean assembleDebug`

### 网盘资源
- 夸克网盘: https://pan.quark.cn/s/36cec7021f0b
- 迅雷网盘: https://pan.xunlei.com/s/VOwcHWkhNGbPmFFMbSXsIfjiA1?pwd=sns4