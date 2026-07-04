# NexusVault - 资源合集分享工具

## 文件说明

### 核心文件
- `index.html` - 主页面（所有界面和功能都在这里）

### EXE 桌面版
- `exe源码.py` - Python 启动器
- 依赖: `pip install pywebview`
- 打包: `pyinstaller --onefile --noconsole --icon=icon.ico --add-data "index.html;." exe源码.py`

### APK 安卓版
- 使用 Capacitor 框架打包
- `MainActivity.java` - Android 主活动
- `capacitor.config.json` - Capacitor 配置
- `styles.xml` - Android 主题样式

### APK 构建步骤
1. `npm init -y`
2. `npm install @capacitor/core @capacitor/cli @capacitor/android`
3. 将 `index.html` 放入 `www/` 目录
4. `npx cap add android`
5. 替换 `android/app/src/main/java/.../MainActivity.java`
6. 替换 `android/app/src/main/res/values/styles.xml`
7. `npx cap sync android`
8. `cd android && gradlew assembleDebug`

### PWA 网页版
- 部署到 GitHub Pages / Cloudflare Pages 即可
- 无需备案，国内可访问

### 网盘资源
- 夸克网盘: https://pan.quark.cn/s/36cec7021f0b
- 迅雷网盘: https://pan.xunlei.com/s/VOwcHWkhNGbPmFFMbSXsIfjiA1?pwd=sns4
- 更新地址: https://anroid.lanzoub.com/b00egmoqfe (密码: 1234)
