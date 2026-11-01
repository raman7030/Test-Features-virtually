package com.umeng.analytics.pro;

import p067l.C6406;

/* JADX INFO: renamed from: com.umeng.analytics.pro.j */
/* JADX INFO: compiled from: V46J */
/* JADX INFO: loaded from: classes.dex */
public class C0714j {

    /* JADX INFO: renamed from: A */
    public static final String f2766A = "MobclickAgent.setSecret方法参数secretkey不能为null，也不能为空字符串。|secretkey参数必须是非空 字符串。";

    /* JADX INFO: renamed from: B */
    public static final String f2767B = "统计SDK常见问题索引贴 详见链接 http://developer.umeng.com/docs/66650/cate/66650";

    /* JADX INFO: renamed from: H */
    public static final String f2773H = "检测到进入页面生命周期时尚未完成SDK初始化，请检查是否未在Application.onCreate函数中执行SDK初始化函数。";

    /* JADX INFO: renamed from: N */
    public static final String f2779N = "MobclickAgent.onDeepLinkReceived方法Context参数不能为null。|参数Context需要指定ApplicationContext值。";

    /* JADX INFO: renamed from: O */
    public static final String f2780O = "MobclickAgent.onDeepLinkReceived方法link参数不能为null，也不能为空字符串。|参数link必须为非空字符串。";

    /* JADX INFO: renamed from: P */
    public static final String f2781P = "MobclickAgent.onDeepLinkReceived方法link参数长度超过限制。|参数link长度不能超过1024字符。";

    /* JADX INFO: renamed from: ar */
    public static final String f2810ar = "请在Application.onCreate函数中使用UMConfigure.preInit函数初始化友盟sdk";

    /* JADX INFO: renamed from: z */
    public static final String f2835z = "MobclickAgent.setSecret方法参数context不能为null|参数Context需要指定ApplicationContext值。";

    /* JADX INFO: renamed from: a */
    public static final String f2792a = C6406.m14671(new StringBuilder("事件属性集合参数为空|onEvent接口必须传入非空的属性集合。详见问题链接 "), "66946");

    /* JADX INFO: renamed from: b */
    public static final String f2811b = C6406.m14671(new StringBuilder("事件ID和保留字冲突|onEvent接口传入的事件ID不能和保留字冲突。详见问题链接 "), "66946");

    /* JADX INFO: renamed from: c */
    public static final String f2812c = C6406.m14671(new StringBuilder("事件ID为null或者为空字符串|onEvent接口传入的事件ID不能为null，也不能为空字符串。详见问题链接 "), "66946");

    /* JADX INFO: renamed from: d */
    public static final String f2813d = C6406.m14671(new StringBuilder("事件属性集合map没有加入K-V值|事件属性集合参数map必须添加K-V值。详见问题链接 "), "66946");

    /* JADX INFO: renamed from: e */
    public static final String f2814e = C6406.m14671(new StringBuilder("事件属性集合map中key值和保留字冲突|事件属性集合map中key值不能和保留字冲突。详见问题链接 "), "66946");

    /* JADX INFO: renamed from: f */
    public static final String f2815f = C6406.m14671(new StringBuilder("事件ID为null或者长度超过限制|事件ID不能为null、空串，且长度不能超过128个字符。详见问题链接 "), "66946");

    /* JADX INFO: renamed from: g */
    public static final String f2816g = C6406.m14671(new StringBuilder("事件属性集合参数为空或者事件属性集合map没有加入K-V值|事件属性集合参数map必须添加K-V值。详见问题链接 "), "66946");

    /* JADX INFO: renamed from: h */
    public static final String f2817h = C6406.m14671(new StringBuilder("事件属性集合map中key非法|事件属性集合参数map中key不能为非法的。详见问题链接 "), "66946");

    /* JADX INFO: renamed from: i */
    public static final String f2818i = C6406.m14671(new StringBuilder("事件属性集合map中value为null|事件属性集合参数map中value不能为null。详见问题链接 "), "66946");

    /* JADX INFO: renamed from: j */
    public static final String f2819j = C6406.m14671(new StringBuilder("事件属性集合map中value长度超过限制|事件属性集合参数map中value如果为字符串时，其长度不能超过256个字符。详见问题链接 "), "66946");

    /* JADX INFO: renamed from: k */
    public static final String f2820k = C6406.m14671(new StringBuilder("事件标签为null或者为空字符串|onEvent接口传入的事件标签不能为null，也不能为空字符串。详见问题链接 "), "66946");

    /* JADX INFO: renamed from: l */
    public static final String f2821l = C6406.m14671(new StringBuilder("事件ID为null或者长度超过限制，或事件标签长度超过限制|事件ID不能为null、空串，且长度不能超过128个字符。事件标签长度不能超过256个字符。详见问题链接 "), "66946");

    /* JADX INFO: renamed from: m */
    public static final String f2822m = C6406.m14671(new StringBuilder("事件ID和保留字冲突|onEvent接口传入的事件ID不能和保留字冲突。详见问题链接 "), "66946");

    /* JADX INFO: renamed from: n */
    public static final String f2823n = C6406.m14671(new StringBuilder("MobclickAgent.onResume接口参数不能为null|MobclickAgent.onResume接口参数应该传入当前Activity的上下文。详见问题链接 "), "66948");

    /* JADX INFO: renamed from: o */
    public static final String f2824o = C6406.m14671(new StringBuilder("MobclickAgent.onResume接口参数不是Activity的上下文|MobclickAgent.onResume接口参数应该传入当前Activity的上下文。详见问题链接 "), "66948");

    /* JADX INFO: renamed from: p */
    public static final String f2825p = C6406.m14671(new StringBuilder("MobclickAgent.onPause接口参数不能为null|MobclickAgent.onPause接口参数应该传入当前Activity的上下文。详见问题链接 "), "66948");

    /* JADX INFO: renamed from: q */
    public static final String f2826q = C6406.m14671(new StringBuilder("MobclickAgent.onPause接口参数不是Activity的上下文|MobclickAgent.onPause接口参数应该传入当前Activity的上下文。详见问题链接 "), "66948");

    /* JADX INFO: renamed from: r */
    public static final String f2827r = C6406.m14671(new StringBuilder("@ 遗漏了Mobclick.onResume函数调用|每个Activity的onResume中都必须调用MobclickAgent.onResume。详见问题链接 "), "66948");

    /* JADX INFO: renamed from: s */
    public static final String f2828s = C6406.m14671(new StringBuilder("@ 遗漏了Mobclick.onPaused函数调用|每个Activity的onPaused中都必须调用MobclickAgent.onPaused。详见问题链接 "), "66948");

    /* JADX INFO: renamed from: t */
    public static final String f2829t = C6406.m14671(new StringBuilder("MobclickAgent.onProfileSignIn接口参数 账号ID 不能为null|账号ID不能为空。详见问题链接 "), "66951");

    /* JADX INFO: renamed from: u */
    public static final String f2830u = C6406.m14671(new StringBuilder("MobclickAgent.onProfileSignIn接口参数 账号ID 长度超过限制|账号ID 长度不能超过64个字符。详见问题链接 "), "66951");

    /* JADX INFO: renamed from: v */
    public static final String f2831v = C6406.m14671(new StringBuilder("MobclickAgent.onProfileSignIn接口参数 账号来源 长度超过限制|账号来源 长度不能超过32个字符。详见问题链接 "), "66951");

    /* JADX INFO: renamed from: w */
    public static final String f2832w = C6406.m14671(new StringBuilder("MobclickAgent.reportError方法参数context不能为null|参数Context需要指定ApplicationContext值。详见问题链接 "), "66971");

    /* JADX INFO: renamed from: x */
    public static final String f2833x = C6406.m14671(new StringBuilder("MobclickAgent.reportError方法参数error不能为null，也不能为空字符串。|error参数必须是非空字符串。详见问题链接 "), "66971");

    /* JADX INFO: renamed from: y */
    public static final String f2834y = C6406.m14671(new StringBuilder("MobclickAgent.reportError方法 Context和Throwable参数都不能为空。|参数Context需要指定ApplicationContext值，Throwable参数传入捕获到的异常对象。详见问题链接 "), "66971");

    /* JADX INFO: renamed from: C */
    public static final String f2768C = C6406.m14671(new StringBuilder("MobclickAgent.onPageStart方法参数不能为null，也不能为空字符串。|参数viewName必须为非空字符串。详见链接 "), "66975");

    /* JADX INFO: renamed from: D */
    public static final String f2769D = C6406.m14671(new StringBuilder("MobclickAgent.onPageEnd方法参数不能为null，也不能为空字符串。|参数viewName必须为非空 字符串。详见链接 "), "66975");

    /* JADX INFO: renamed from: E */
    public static final String f2770E = C6406.m14671(new StringBuilder("对于页面@，onPageStart和onPageEnd调用对的参数不一致。|对于同一个页面，请先调用onPageStart，再调用onPageEnd。详见链接 "), "66975");

    /* JADX INFO: renamed from: F */
    public static final String f2771F = C6406.m14671(new StringBuilder("对于页面@，请确保先依序成对调用onPageStart，onPageEnd接口，再调用onPageStart接口对其它页面进行统计。|对于任意一个页面，必须依序成对调用onPageStart以及onPageEnd，不能有遗漏。详见链接 "), "66975");

    /* JADX INFO: renamed from: G */
    public static final String f2772G = C6406.m14671(new StringBuilder("对于页面@，请检查是否遗漏onPageStart接口调用。|对于任意一个页面，必须依序成对调用onPageStart以及onPageEnd，不能有遗漏。详见链接 "), "66975");

    /* JADX INFO: renamed from: I */
    public static final String f2774I = C6406.m14671(new StringBuilder("当前发送策略为：启动时发送。详见链接 "), "66976");

    /* JADX INFO: renamed from: J */
    public static final String f2775J = C6406.m14671(new StringBuilder("当前发送策略为: 间隔发送。间隔时间为：@秒。详见链接 "), "66976");

    /* JADX INFO: renamed from: K */
    public static final String f2776K = C6406.m14671(new StringBuilder("当前发送策略为: 集成测试。但是SDK未切换到调试模式，所以后台设置未生效。|如想切换到集成测试发送策略，请调用UMConfigure.setLogEnabled(true)将SDK切换到调试模式。详见链接 "), "66976");

    /* JADX INFO: renamed from: L */
    public static final String f2777L = C6406.m14671(new StringBuilder("当前发送策略为：集成测试。详见链接 "), "66976");

    /* JADX INFO: renamed from: M */
    public static final String f2778M = C6406.m14671(new StringBuilder("当前发送策略为: 准实时发送。间隔时间为：@秒。详见链接 "), "66976");

    /* JADX INFO: renamed from: Q */
    public static final String f2782Q = C6406.m14671(new StringBuilder("发送数据时发生java.net.UnknownHostException异常|友盟后端对设备端证书验证失败。请确保设备端没有运行抓包代理类程序。详见链接 "), "66978");

    /* JADX INFO: renamed from: R */
    public static final String f2783R = C6406.m14671(new StringBuilder("发送数据时发生javax.net.sslHandshakeException异常|导致友盟后端域名解析失败。请检查系统DNS服务器配置是否正确。详见链接 "), "66978");

    /* JADX INFO: renamed from: S */
    public static final String f2784S = C6406.m14671(new StringBuilder("track接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接："), "67310");

    /* JADX INFO: renamed from: T */
    public static final String f2785T = C6406.m14671(new StringBuilder("registerSuperProperty接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接："), "67310");

    /* JADX INFO: renamed from: U */
    public static final String f2786U = C6406.m14671(new StringBuilder("unregisterSuperProperty接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接："), "67310");

    /* JADX INFO: renamed from: V */
    public static final String f2787V = C6406.m14671(new StringBuilder("getSuperProperty接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接: "), "67310");

    /* JADX INFO: renamed from: W */
    public static final String f2788W = C6406.m14671(new StringBuilder("getSuperProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接："), "67310");

    /* JADX INFO: renamed from: X */
    public static final String f2789X = C6406.m14671(new StringBuilder("clearSuperProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接："), "67310");

    /* JADX INFO: renamed from: Y */
    public static final String f2790Y = C6406.m14671(new StringBuilder("setFirstLaunchEvent接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接："), "67310");

    /* JADX INFO: renamed from: Z */
    public static final String f2791Z = C6406.m14671(new StringBuilder("registerPreProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接："), "67310");

    /* JADX INFO: renamed from: aa */
    public static final String f2793aa = C6406.m14671(new StringBuilder("unregisterPreProperty接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接："), "67310");

    /* JADX INFO: renamed from: ab */
    public static final String f2794ab = C6406.m14671(new StringBuilder("clearPreProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接："), "67310");

    /* JADX INFO: renamed from: ac */
    public static final String f2795ac = C6406.m14671(new StringBuilder("getPreProperties接口调用非法。|当前处于非DPLUS场景中，不能使用DPLUS相关接口，详见问题连接："), "67310");

    /* JADX INFO: renamed from: ad */
    public static final String f2796ad = C6406.m14671(new StringBuilder("eventName为空，请检查|eventName参数不能为空，详见问题连接："), "67311");

    /* JADX INFO: renamed from: ae */
    public static final String f2797ae = C6406.m14671(new StringBuilder("请注意：map为空|track接口的参数说明，详见问题连接："), "67311");

    /* JADX INFO: renamed from: af */
    public static final String f2798af = C6406.m14671(new StringBuilder("context参数为空｜context参数不能为空，详见问题连接："), "67312");

    /* JADX INFO: renamed from: ag */
    public static final String f2799ag = C6406.m14671(new StringBuilder("propertyName参数或propertyValue参数为空｜propertyName、propertyValue参数不能为空，详见问题连接："), "67312");

    /* JADX INFO: renamed from: ah */
    public static final String f2800ah = C6406.m14671(new StringBuilder("context参数为空|context参数不能为空，详见问题连接："), "67313");

    /* JADX INFO: renamed from: ai */
    public static final String f2801ai = C6406.m14671(new StringBuilder("context参数为空|context参数不能为空，详见问题连接："), "67316");

    /* JADX INFO: renamed from: aj */
    public static final String f2802aj = C6406.m14671(new StringBuilder("context参数为空|context参数不能为空，详见问题连接："), "67318");

    /* JADX INFO: renamed from: ak */
    public static final String f2803ak = C6406.m14671(new StringBuilder("trackID参数为空|trackID参数不能为空，详见问题连接："), "67318");

    /* JADX INFO: renamed from: al */
    public static final String f2804al = C6406.m14671(new StringBuilder("context参数为空|context参数不能为空，详见问题连接："), "67319");

    /* JADX INFO: renamed from: am */
    public static final String f2805am = C6406.m14671(new StringBuilder("propertics参数为空|propertics参数不能为空，详见问题连接："), "67319");

    /* JADX INFO: renamed from: an */
    public static final String f2806an = C6406.m14671(new StringBuilder("context参数为空|context参数不能为空，详见问题连接："), "67320");

    /* JADX INFO: renamed from: ao */
    public static final String f2807ao = C6406.m14671(new StringBuilder("未匹配到您传入的property参数|property参数不能匹配，"), "67320");

    /* JADX INFO: renamed from: ap */
    public static final String f2808ap = C6406.m14671(new StringBuilder("context参数为空|context参数不能为空，详见问题连接："), "67321");

    /* JADX INFO: renamed from: aq */
    public static final String f2809aq = C6406.m14671(new StringBuilder("context参数为空|context参数不能为空，详见问题连接："), "67322");
}
