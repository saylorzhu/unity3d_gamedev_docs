# Atom打造高效markdown编辑环境



## 1. 相关插件

### 通用插件
- [highlight-selected](https://atom.io/packages/highlight-selected)：高亮显示文件中与选中单词，对代码编辑或者英文书写有帮助

### markdown相关插件
- [markdown-writer](https://github.com/zhuochun/md-writer)：高效编辑markdown格式
- [markdown-toc](https://atom.io/packages/markdown-toc)：根据各级标题生成目录
- [markdown-preview-plus](https://atom.io/packages/markdown-preview-plus)：代替默认的markdown预览包
- [markdown-scroll-sync](https://atom.io/packages/markdown-scroll-sync)：预览和编辑模式同步滚屏
- [markdown-image-helper](https://atom.io/packages/markdown-image-helper)：
- [markdown-themeable-pdf](https://atom.io/packages/markdown-themeable-pdf)：可以将md格式转换成PDF、HTML、JPEG、PNG
- [pdf-view](https://atom.io/packages/pdf-view)：与markdown-htemeable-pdf配套使用，可以预览导出的pdf文件

<!-- ![test_iamge](assets/2016-04-20-test-7600e.png) -->

## 可能碰到的问题
- markdown-themeable-pdf 转pdf失败
> Stack Trace
> Uncaught AssertionError: html-pdf: Failed to load PhantomJS module. You have to set the path to the PhantomJS binary using 'options.phantomPath'


可以尝试下面下种方法：

	 1. 卸载markdown-themeable-pdf重新安装
	 2. 还是不行的话，卸载atom重新安装一次

- 不能通过atom在线安装包
> tunneling socket could not be established, cause=connect ETIMEDOUT

cd .atom/packages
git clone URL
cd atom-script
apm install
