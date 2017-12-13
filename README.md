## 生命周期
onCreate() 正在被创建，加载布局资源  
onRestart() 从不可见到可见状态  
onStart() 可见状态但用户还看不到  
onResume() 前台活动  
onPause() Activity正在停止  
onStop() Activity即将停止  
onDestroy() 即将被销毁  
具体说明几种情况  
1. Activity第一次启动，onCreate->onStart->onResume。
2. 打开新的Activity或者切换回桌面，onPause->onStop,有一种特殊情况，就是当新Activity是透明主题时不执行onStop。
3. 当用户回到原Activity时，onRestart->onStart->onResume。
4. 当用户back键关闭Activity时，onPause->onStop->onDestroy
5. 横竖屏切换onPause-->onSaveInstanceState-->onStop-->onDestroy-->onCreate-->onStart-->onRestoreInstanceState-->onResume  
6. Activity 上有 Dialog 的时候按 home 键时的生命周期onPause->onStop切换回来是 onStart->onResume
- 意外销毁  
Activity意外销毁时，临时状态保存
onSaveInstanceState()和onRestoreInstanceState()
## 启动模式
- Activity的LaunchMode
1. standard 标准模式  
2. singleTop 栈顶复用模式  
简单的来说，如果Activity在栈顶，这是启动该Activity，那么就会复用，并调用onNewIntent方法；如果不再栈顶即使在栈内启动该Activity也会重新创建。（用于通知）
3. singleTask 栈内复用模式
简单的来说，只要Activity在栈内，调用就会启动复用该Activity，并调用onNewIntent方法，更会清除其Activity上的其他Activity。（用于主页面）
4. singleInstance 单实例模式
简单的来说，是加强版singleTask，只会为它创建一个栈，除非栈被销毁才会重新创建新栈。
- Activity的Flags
1. FLAG_ACTIVITY_NEW_TASK  
类似singleTask
2. FLAG_ACTIVITY_SINGLE_TOP  
类似singleTop
3. FLAG_ACTIVITY_CLEAR_TOP  
使用后会清除其之上所有Activity
4. FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS  
使用后该Activity不会在历史列表中
- IntentFilter匹配规则  
可以过滤action、category、data信息。一个Activity可以有多组<intent-filter>,只要匹配<intent-filter>就可成功调起。  
action必须匹配，并必须有一个正确。  
category可以匹配，匹配了一定要正确。AndroidManifest.xml比较加android.intent.category.DEFAULT  
data类似http请求传参。
