.class public final Ll/֨ۚ᩷;
.super Ll/ۗܺ᩷;
.source "E72G"


# static fields
.field public static final ֫ܽ:Ll/᩵ۚ᩷;

.field public static final ۟ۧ:I

.field public static final ۧܽ:Ll/ۧۤᩴ;

.field public static final ܰۧ:I

.field public static final ܽܽ:[I

.field public static final ᩺ۧ:Ll/᩵ۚ᩷;


# instance fields
.field public ֡ۧ:Ll/֡ۚ᩷;

.field public ֨ۧ:Z

.field public ۖۧ:Landroid/os/Bundle;

.field public ۗۧ:Landroid/view/MenuItem;

.field public ۘۧ:Ll/ᩴۚ᩷;

.field public ۙۧ:Ljava/lang/String;

.field public final ۚۧ:Ljava/lang/Object;

.field public ۛۧ:I

.field public ۜۧ:Ll/᩶ۚ᩷;

.field public ۠ۧ:Landroid/view/View;

.field public ۡۧ:Z

.field public ۢۧ:Ll/ܳܿܳ;

.field public ۤۧ:Landroid/widget/FrameLayout;

.field public ۨۧ:Landroid/widget/TextView;

.field public ۫ۧ:Landroid/widget/FrameLayout;

.field public ۬ۧ:Landroid/webkit/WebView;

.field public ܳۧ:Landroid/view/MenuItem;

.field public ܶۧ:Landroid/widget/ProgressBar;

.field public ܺۧ:Ll/ۗܿܳ;

.field public ܿۧ:Landroid/view/MenuItem;

.field public ᩳۧ:Ll/֨۟ۧ;

.field public ᩴۧ:Ll/᩸ۖ;

.field public volatile ᩵ۧ:Ll/᩵ۚ᩷;

.field public ᩶ۧ:Ll/ۚۚ᩷;

.field public ᩷ۧ:Landroid/view/MenuItem;

.field public ᩸ۧ:Landroid/view/MenuItem;

.field public ᩹ۧ:Ll/ۖܿܳ;

.field public ᩻ۧ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x11

    new-array v0, v0, [I

    .line 89
    fill-array-data v0, :array_0

    sput-object v0, Ll/֨ۚ᩷;->ܽܽ:[I

    const/4 v1, 0x0

    .line 92
    aget v2, v0, v1

    sput v2, Ll/֨ۚ᩷;->۟ۧ:I

    const/16 v2, 0x10

    .line 93
    aget v0, v0, v2

    sput v0, Ll/֨ۚ᩷;->ܰۧ:I

    .line 99
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    sput-object v0, Ll/֨ۚ᩷;->ۧܽ:Ll/ۧۤᩴ;

    .line 100
    new-instance v0, Ll/᩵ۚ᩷;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/᩵ۚ᩷;-><init>(ZLjava/lang/String;)V

    sput-object v0, Ll/֨ۚ᩷;->᩺ۧ:Ll/᩵ۚ᩷;

    .line 101
    new-instance v0, Ll/᩵ۚ᩷;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v2}, Ll/᩵ۚ᩷;-><init>(ZLjava/lang/String;)V

    sput-object v0, Ll/֨ۚ᩷;->֫ܽ:Ll/᩵ۚ᩷;

    return-void

    :array_0
    .array-data 4
        0x19
        0x21
        0x32
        0x43
        0x4b
        0x50
        0x5a
        0x64
        0x6e
        0x7d
        0x96
        0xaf
        0xc8
        0xfa
        0x12c
        0x190
        0x1f4
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 81
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    const/16 v0, 0x64

    .line 128
    iput v0, p0, Ll/֨ۚ᩷;->ۛۧ:I

    .line 130
    sget-object v0, Ll/֨ۚ᩷;->᩺ۧ:Ll/᩵ۚ᩷;

    iput-object v0, p0, Ll/֨ۚ᩷;->᩵ۧ:Ll/᩵ۚ᩷;

    .line 131
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/֨ۚ᩷;->ۚۧ:Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ll/֨ۚ᩷;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 12

    .line 1044
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v1

    .line 1045
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    move-result-object v2

    .line 1046
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    .line 1047
    invoke-direct {p0, v1}, Ll/֨ۚ᩷;->ܽ(Landroid/net/Uri;)V

    .line 697
    iget-object v0, p0, Ll/֨ۚ᩷;->᩵ۧ:Ll/᩵ۚ᩷;

    .line 698
    iget-object v4, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v4}, Ll/ۚۚ᩷;->ᩳ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v4

    .line 699
    iget-object v5, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v5}, Ll/ۚۚ᩷;->᩷(Ll/ۚۚ᩷;)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v5}, Ll/ۚۚ᩷;->ܽ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v3

    .line 698
    :goto_0
    invoke-static {v1, v4, v5, v0}, Ll/֨ۚ᩷;->֫(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ll/᩵ۚ᩷;)Ll/᩵ۚ᩷;

    move-result-object v4

    .line 852
    iget-boolean v5, v0, Ll/᩵ۚ᩷;->֫:Z

    if-eqz v5, :cond_1

    iget-boolean v5, v4, Ll/᩵ۚ᩷;->֫:Z

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    move-object v4, v0

    :goto_1
    if-eq v4, v0, :cond_2

    .line 702
    iput-object v4, p0, Ll/֨ۚ᩷;->᩵ۧ:Ll/᩵ۚ᩷;

    .line 1050
    :cond_2
    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->ᩳ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۜܿܳ;->֫(Landroid/net/Uri;Ljava/lang/String;)Z

    move-result v0

    const/16 v4, 0x193

    if-eqz v0, :cond_10

    .line 816
    iget-object v0, p0, Ll/֨ۚ᩷;->ۚۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 817
    :try_start_0
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result v3

    iget-object v5, p0, Ll/֨ۚ᩷;->᩵ۧ:Ll/᩵ۚ᩷;

    .line 818
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    move-result-object v6

    iget-object v7, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v7}, Ll/ۚۚ᩷;->ᩳ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Ll/֨ۚ᩷;->֡ۧ:Ll/֡ۚ᩷;

    const-string v9, "Referer"

    const-string v10, "Sec-Fetch-Site"

    const/4 v11, 0x0

    if-nez v3, :cond_6

    .line 796
    iget-boolean v3, v5, Ll/᩵ۚ᩷;->֫:Z

    if-eqz v3, :cond_3

    goto :goto_2

    .line 799
    :cond_3
    invoke-static {v10, v6}, Ll/֨ۚ᩷;->֫(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    const-string v5, "same-origin"

    .line 801
    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    goto :goto_3

    .line 803
    :cond_4
    invoke-static {v9, v6}, Ll/֨ۚ᩷;->֫(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 805
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-static {v3, v7}, Ll/ۜܿܳ;->֫(Landroid/net/Uri;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    goto :goto_3

    :cond_6
    :goto_2
    const/4 v3, 0x1

    :goto_3
    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    if-eqz v8, :cond_9

    .line 810
    invoke-static {v10, v6}, Ll/֨ۚ᩷;->֫(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_8

    .line 811
    invoke-static {v9, v6}, Ll/֨ۚ᩷;->֫(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_8

    const/4 v11, 0x1

    :cond_8
    if-eqz v11, :cond_9

    .line 831
    invoke-virtual {v8}, Ll/֡ۚ᩷;->֫()V

    :cond_9
    const/4 v11, 0x1

    .line 817
    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v11, :cond_a

    const-string p0, "Forbidden"

    .line 1052
    invoke-static {v4, p0}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p0

    return-object p0

    :cond_a
    const-string v0, "GET"

    .line 1054
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_b

    const/16 p0, 0x195

    const-string p1, "Method Not Allowed"

    .line 1055
    invoke-static {p0, p1}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p0

    return-object p0

    .line 1057
    :cond_b
    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->ۜ(Ll/ۚۚ᩷;)I

    move-result v0

    const/16 v2, 0x194

    if-ltz v0, :cond_d

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 1058
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v3, "/_mt_markdown_vendor_/"

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1059
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p1

    if-nez p1, :cond_c

    iget-object p0, p0, Ll/֨ۚ᩷;->ܺۧ:Ll/ۗܿܳ;

    if-eqz p0, :cond_c

    .line 1060
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۗܿܳ;->֫(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p0

    return-object p0

    :cond_c
    const-string p0, "Not Found"

    .line 1061
    invoke-static {v2, p0}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p0

    return-object p0

    .line 1063
    :cond_d
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {p1}, Ll/ۚۚ᩷;->ۖ(Ll/ۚۚ᩷;)Ll/ܰܺܳ;

    move-result-object p1

    instance-of p1, p1, Ll/ۗۢ᩻;

    if-eqz p1, :cond_e

    .line 1064
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_e

    .line 1065
    iget-object p0, p0, Ll/֨ۚ᩷;->᩹ۧ:Ll/ۖܿܳ;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۖܿܳ;->ۧ(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p0

    goto :goto_5

    .line 1066
    :cond_e
    iget-object p0, p0, Ll/֨ۚ᩷;->ᩳۧ:Ll/֨۟ۧ;

    invoke-virtual {p0, v1}, Ll/֨۟ۧ;->֫(Landroid/net/Uri;)Landroid/webkit/WebResourceResponse;

    move-result-object p0

    :goto_5
    if-nez p0, :cond_f

    const-string p0, "Not Found"

    .line 1068
    invoke-static {v2, p0}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p0

    :cond_f
    return-object p0

    :catchall_0
    move-exception p0

    .line 819
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 1071
    :cond_10
    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->᩷(Ll/ۚۚ᩷;)Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->ܽ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۙᩳܳ;->֫(Landroid/net/Uri;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 1072
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result v0

    if-eqz v0, :cond_11

    const-string v0, "GET"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->ۖ(Ll/ۚۚ᩷;)Ll/ܰܺܳ;

    move-result-object v0

    instance-of v0, v0, Ll/ۗۢ᩻;

    if-eqz v0, :cond_11

    .line 1074
    iget-object p0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {p0}, Ll/ۚۚ᩷;->ܽ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۙᩳܳ;->ۧ(Ljava/lang/String;)V

    .line 1076
    :cond_11
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p0

    if-eqz p0, :cond_12

    const-string p0, "GET"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_12

    goto :goto_6

    :cond_12
    const-string p0, "Forbidden"

    .line 1078
    invoke-static {v4, p0}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p0

    return-object p0

    .line 1081
    :cond_13
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v2, "content"

    .line 1082
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_16

    const-string v2, "file"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_7

    .line 1085
    :cond_14
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p1

    if-eqz p1, :cond_15

    invoke-direct {p0, v1}, Ll/֨ۚ᩷;->ᩳ(Landroid/net/Uri;)Z

    move-result p0

    if-eqz p0, :cond_15

    const-string p0, "Forbidden"

    .line 1087
    invoke-static {v4, p0}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p0

    return-object p0

    :cond_15
    :goto_6
    return-object v3

    :cond_16
    :goto_7
    const-string p0, "Forbidden"

    .line 1083
    invoke-static {v4, p0}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 2

    .line 840
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 841
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 842
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ll/᩵ۚ᩷;)Ll/᩵ۚ᩷;
    .locals 6

    .line 754
    invoke-static {p0, p1}, Ll/ۜܿܳ;->֫(Landroid/net/Uri;Ljava/lang/String;)Z

    move-result v0

    sget-object v1, Ll/֨ۚ᩷;->֫ܽ:Ll/᩵ۚ᩷;

    if-nez v0, :cond_c

    .line 755
    invoke-static {p0, p2}, Ll/ۙᩳܳ;->֫(Landroid/net/Uri;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto/16 :goto_4

    :cond_0
    if-nez p0, :cond_1

    const/4 p2, 0x0

    goto :goto_0

    .line 758
    :cond_1
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p2

    :goto_0
    if-nez p2, :cond_2

    goto/16 :goto_1

    .line 762
    :cond_2
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "http"

    .line 763
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_a

    const-string v3, "https"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_3

    :cond_3
    const-string v5, "blob"

    .line 769
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 770
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {p0, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    .line 771
    invoke-static {p0, p1}, Ll/ۜܿܳ;->֫(Landroid/net/Uri;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    return-object v1

    .line 774
    :cond_4
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 776
    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_5

    .line 777
    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 778
    :cond_5
    invoke-static {p0}, Ll/֨ۚ᩷;->ۧ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_6

    .line 780
    new-instance p1, Ll/᩵ۚ᩷;

    invoke-direct {p1, v4, p0}, Ll/᩵ۚ᩷;-><init>(ZLjava/lang/String;)V

    return-object p1

    .line 783
    :cond_6
    new-instance p0, Ll/᩵ۚ᩷;

    const-string p1, "blob:"

    invoke-direct {p0, v4, p1}, Ll/᩵ۚ᩷;-><init>(ZLjava/lang/String;)V

    return-object p0

    :cond_7
    const-string p0, "data"

    .line 785
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    const-string p0, "about"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_8

    goto :goto_2

    :cond_8
    :goto_1
    return-object p3

    .line 786
    :cond_9
    :goto_2
    new-instance p0, Ll/᩵ۚ᩷;

    const-string p1, ":"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v4, p1}, Ll/᩵ۚ᩷;-><init>(ZLjava/lang/String;)V

    return-object p0

    .line 764
    :cond_a
    :goto_3
    invoke-static {p0}, Ll/֨ۚ᩷;->ۧ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_b

    .line 766
    sget-object p0, Ll/֨ۚ᩷;->᩺ۧ:Ll/᩵ۚ᩷;

    return-object p0

    .line 767
    :cond_b
    new-instance p1, Ll/᩵ۚ᩷;

    invoke-direct {p1, v4, p0}, Ll/᩵ۚ᩷;-><init>(ZLjava/lang/String;)V

    return-object p1

    :cond_c
    :goto_4
    return-object v1
.end method

.method public static synthetic ֫(Ll/֨ۚ᩷;Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 6

    .line 1136
    iget-boolean v0, p0, Ll/֨ۚ᩷;->᩻ۧ:Z

    const/4 v1, 0x7

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x7

    :goto_0
    or-int/lit16 v0, v0, 0x80

    .line 1135
    invoke-virtual {p2, v0}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object v0

    const/16 v2, 0x8

    .line 1137
    invoke-virtual {p2, v2}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object v2

    .line 1138
    iget v3, v0, Ll/ۧ۬;->ۧ:I

    iget v4, v0, Ll/ۧ۬;->ᩳ:I

    iget v5, v0, Ll/ۧ۬;->ܽ:I

    iget v0, v0, Ll/ۧ۬;->֫:I

    iget v2, v2, Ll/ۧ۬;->֫:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p1, v3, v4, v5, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 1139
    iget-object p0, p0, Ll/֨ۚ᩷;->ۜۧ:Ll/᩶ۚ᩷;

    invoke-virtual {p2, v1}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ۚ᩷;->֫(Ll/ۧ۬;)V

    .line 1140
    sget-object p0, Ll/᩸ܰ;->ۧ:Ll/᩸ܰ;

    return-object p0
.end method

.method private ֫(IZ)V
    .locals 1

    .line 1438
    iput-boolean p2, p0, Ll/֨ۚ᩷;->ۡۧ:Z

    .line 1439
    iget-object v0, p0, Ll/֨ۚ᩷;->ܶۧ:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_1

    .line 1440
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1441
    iget-object p1, p0, Ll/֨ۚ᩷;->ܶۧ:Landroid/widget/ProgressBar;

    if-eqz p2, :cond_0

    iget-boolean p2, p0, Ll/֨ۚ᩷;->᩻ۧ:Z

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const/16 p2, 0x8

    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 1443
    :cond_1
    invoke-direct {p0}, Ll/֨ۚ᩷;->֫֫()V

    return-void
.end method

.method public static ֫(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;I)V
    .locals 7

    const/4 v0, 0x0

    .line 183
    invoke-static {v0, p4}, Ljava/lang/Math;->max(II)I

    move-result v6

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v6}, Ll/֨ۚ᩷;->֫(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLl/ܶ᩵ܿ;I)V

    return-void
.end method

.method public static ֫(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLl/ܶ᩵ܿ;)V
    .locals 6

    const/4 v5, -0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    .line 177
    invoke-static/range {v0 .. v5}, Ll/֨ۚ᩷;->֫(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLl/ܶ᩵ܿ;I)V

    return-void
.end method

.method public static ֫(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLl/ܶ᩵ܿ;I)V
    .locals 17

    move-object/from16 v0, p1

    move/from16 v1, p5

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move-object v0, v3

    goto :goto_0

    :cond_0
    :try_start_0
    new-array v2, v2, [Ljava/lang/String;

    .line 190
    invoke-static {v0, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    move-object v2, v3

    goto :goto_1

    .line 191
    :cond_1
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    const-string v4, "/"

    if-eqz v2, :cond_4

    .line 235
    :try_start_1
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    .line 238
    :cond_2
    invoke-virtual {v2, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_4
    :goto_2
    move-object v2, v3

    :goto_3
    if-eqz v2, :cond_5

    const/4 v5, 0x1

    const/4 v15, 0x1

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    const/4 v15, 0x0

    :goto_4
    if-eqz v15, :cond_9

    if-nez p3, :cond_8

    if-ltz v1, :cond_6

    goto :goto_6

    .line 200
    :cond_6
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴܿܳ;->ܽ(Ljava/lang/String;)Ll/ᩴܿܳ;

    move-result-object v0

    .line 201
    invoke-virtual {v0}, Ll/ᩴܿܳ;->֫()Ljava/lang/String;

    move-result-object v2

    .line 203
    sget-object v4, Ll/ܽ֡ܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_7

    sget-object v4, Ll/ܽ֡ܿ;->ܽ:Ll/ܶ᩵ܿ;

    .line 204
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_7

    sget-object v4, Ll/ܽ֡ܿ;->֫:Ll/ܶ᩵ܿ;

    .line 205
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_7

    .line 206
    new-instance v2, Ll/֨ܿܳ;

    sget-object v3, Ll/ۙ᩸᩷;->᩻:Ll/۫ۤۡ;

    invoke-direct {v2, v3}, Ll/֨ܿܳ;-><init>(Ll/۫ۤۡ;)V

    .line 207
    invoke-virtual {v2, v0}, Ll/֨ܿܳ;->֫(Ll/ᩴܿܳ;)Ljava/lang/String;

    move-result-object v3

    .line 209
    new-instance v4, Ll/ܰ֡᩷;

    invoke-direct {v4, v2, v0, v3}, Ll/ܰ֡᩷;-><init>(Ll/֨ܿܳ;Ll/ᩴܿܳ;Ljava/lang/String;)V

    move-object/from16 v16, v4

    move-object v4, v3

    move-object/from16 v3, v16

    goto :goto_5

    :cond_7
    move-object v4, v2

    .line 211
    :goto_5
    invoke-virtual {v0, v4}, Ll/ᩴܿܳ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    .line 197
    :cond_8
    :goto_6
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    move-object v8, v2

    goto :goto_8

    :cond_9
    const-string v0, "index.html"

    :goto_7
    move-object v9, v0

    move-object v8, v4

    .line 217
    :goto_8
    invoke-static {v8, v9}, Ll/ۜܿܳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_a

    .line 221
    new-instance v0, Ll/ۚۚ᩷;

    sget-object v7, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    const/4 v12, 0x1

    move-object v6, v0

    move-object/from16 v11, p2

    move/from16 v13, p3

    move-object/from16 v14, p4

    invoke-direct/range {v6 .. v15}, Ll/ۚۚ᩷;-><init>(Ll/ܰܺܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLl/ܶ᩵ܿ;Z)V

    .line 224
    invoke-static {v0, v1}, Ll/ۚۚ᩷;->֫(Ll/ۚۚ᩷;I)V

    move-object/from16 v1, p0

    .line 225
    invoke-static {v1, v0, v3}, Ll/֨ۚ᩷;->֫(Landroid/app/Activity;Ll/ۚۚ᩷;Ljava/lang/Runnable;)V

    return-void

    .line 219
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid HTML preview path"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 227
    :catch_0
    invoke-virtual/range {p4 .. p4}, Ll/ܶ᩵ܿ;->۬()Z

    const v0, 0x7f120711

    .line 228
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public static ֫(Landroid/app/Activity;Ll/ۚۚ᩷;Ljava/lang/Runnable;)V
    .locals 6

    .line 287
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    .line 288
    sget-object v1, Ll/֨ۚ᩷;->ۧܽ:Ll/ۧۤᩴ;

    invoke-virtual {v1, v0, p1}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v2

    new-instance v3, Ll/᩺֡᩷;

    invoke-direct {v3, p1, v0}, Ll/᩺֡᩷;-><init>(Ll/ۚۚ᩷;Ljava/lang/String;)V

    const-wide/32 v4, 0xea60

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 291
    new-instance v2, Landroid/content/Intent;

    const-class v3, Ll/֨ۚ᩷;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "session_token"

    .line 292
    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 294
    :try_start_0
    invoke-virtual {p0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    if-eqz p2, :cond_0

    .line 296
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    .line 299
    :catch_0
    invoke-virtual {v1, v0, p1}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 300
    invoke-virtual {p1}, Ll/ۚۚ᩷;->close()V

    :cond_1
    const p0, 0x7f120711

    .line 302
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method private ֫(Landroid/net/Uri;)V
    .locals 3

    .line 621
    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->ᩳ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v0

    .line 622
    iget-object v1, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v1}, Ll/ۚۚ᩷;->᩷(Ll/ۚۚ᩷;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v1}, Ll/ۚۚ᩷;->ܽ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Ll/֨ۚ᩷;->᩵ۧ:Ll/᩵ۚ᩷;

    .line 621
    invoke-static {p1, v0, v1, v2}, Ll/֨ۚ᩷;->֫(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ll/᩵ۚ᩷;)Ll/᩵ۚ᩷;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/֨ۚ᩷;->֫(Ll/᩵ۚ᩷;)V

    return-void
.end method

.method public static ֫(Landroid/webkit/WebView;Z)V
    .locals 1

    .line 470
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p0

    const-string v0, "ALGORITHMIC_DARKENING"

    .line 472
    invoke-static {v0}, Ll/ܰۘܺ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 473
    invoke-static {p0}, Ll/ᩴ۟ۧ;->ۧ(Landroid/webkit/WebSettings;)V

    :cond_0
    const-string v0, "FORCE_DARK"

    .line 476
    invoke-static {v0}, Ll/ܰۘܺ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "FORCE_DARK_STRATEGY"

    .line 477
    invoke-static {v0}, Ll/ܰۘܺ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 478
    invoke-static {p0}, Ll/ᩴ۟ۧ;->ܽ(Landroid/webkit/WebSettings;)V

    if-eqz p1, :cond_1

    const/4 p1, 0x2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 480
    :goto_0
    invoke-static {p0, p1}, Ll/ᩴ۟ۧ;->֫(Landroid/webkit/WebSettings;I)V

    :cond_2
    return-void
.end method

.method public static ֫(Lbin/mt/plus/ShortcutActivity;Ljava/lang/String;)V
    .locals 9

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 152
    invoke-static {p1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 153
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v0

    const v1, 0x7f120711

    if-nez v0, :cond_0

    .line 154
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 157
    :cond_0
    sget-object v3, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ll/ۖۧ᩻;->֫(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v4

    if-nez v4, :cond_1

    .line 159
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 162
    :cond_1
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ᩴܿܳ;->ܽ(Ljava/lang/String;)Ll/ᩴܿܳ;

    move-result-object v5

    .line 163
    new-instance p1, Ll/֨ܿܳ;

    sget-object v0, Ll/ۙ᩸᩷;->᩻:Ll/۫ۤۡ;

    invoke-direct {p1, v0}, Ll/֨ܿܳ;-><init>(Ll/۫ۤۡ;)V

    .line 164
    invoke-virtual {p1, v5}, Ll/֨ܿܳ;->֫(Ll/ᩴܿܳ;)Ljava/lang/String;

    move-result-object v6

    .line 165
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    new-instance v8, Ll/᩷ۚ᩷;

    invoke-direct {v8, p1, v5, v6}, Ll/᩷ۚ᩷;-><init>(Ll/֨ܿܳ;Ll/ᩴܿܳ;Ljava/lang/String;)V

    move-object v2, p0

    invoke-static/range {v2 .. v8}, Ll/֨ۚ᩷;->֫(Ll/֫᩹᩷;Ll/ܰܺܳ;Ll/ᩳۜܳ;Ll/ᩴܿܳ;Ljava/lang/String;Ljava/util/List;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ֫(Ll/֨ۚ᩷;)V
    .locals 1

    const/4 v0, 0x1

    .line 1263
    invoke-direct {p0, v0}, Ll/֨ۚ᩷;->֫(Z)V

    return-void
.end method

.method public static synthetic ֫(Ll/֨ۚ᩷;IIII)V
    .locals 0

    sub-int/2addr p2, p1

    sub-int/2addr p4, p3

    if-eq p2, p4, :cond_0

    .line 401
    invoke-direct {p0}, Ll/֨ۚ᩷;->᩺()V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/֨ۚ᩷;Landroid/net/Uri;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/֨ۚ᩷;->ܽ(Landroid/net/Uri;)V

    return-void
.end method

.method public static synthetic ֫(Ll/֨ۚ᩷;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 1

    const-string v0, "true"

    .line 1490
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Ll/֨ۚ᩷;->ۖۧ:Landroid/os/Bundle;

    if-ne p2, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ll/֨ۚ᩷;->ۖۧ:Landroid/os/Bundle;

    :cond_0
    return-void
.end method

.method public static ֫(Ll/֨ۚ᩷;Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 4

    .line 627
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    .line 865
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 868
    :cond_0
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    .line 869
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    :goto_0
    move-object p2, v1

    :cond_2
    if-eqz p2, :cond_5

    .line 629
    invoke-direct {p0, p2}, Ll/֨ۚ᩷;->֫(Landroid/net/Uri;)V

    .line 630
    iget-object v0, p0, Ll/֨ۚ᩷;->᩵ۧ:Ll/᩵ۚ᩷;

    iget-boolean v0, v0, Ll/᩵ۚ᩷;->֫:Z

    if-eqz v0, :cond_5

    .line 875
    invoke-virtual {p2}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroid/net/Uri$Builder;->fragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    .line 663
    iget-object v0, p0, Ll/֨ۚ᩷;->ۚۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 664
    :try_start_0
    iget-object v2, p0, Ll/֨ۚ᩷;->֡ۧ:Ll/֡ۚ᩷;

    if-eqz v2, :cond_4

    .line 665
    iget-object v3, v2, Ll/֡ۚ᩷;->֫:Ljava/lang/String;

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    .line 668
    :cond_3
    iput-object v1, p0, Ll/֨ۚ᩷;->֡ۧ:Ll/֡ۚ᩷;

    .line 669
    invoke-virtual {v2, p2}, Ll/֡ۚ᩷;->֫(Ljava/lang/String;)Z

    move-result p0

    .line 670
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_5

    .line 673
    invoke-virtual {p1}, Landroid/webkit/WebView;->reload()V

    return-void

    .line 666
    :cond_4
    :goto_1
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 670
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :cond_5
    return-void
.end method

.method public static bridge synthetic ֫(Ll/֨ۚ᩷;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/֨ۚ᩷;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic ֫(Ll/֨ۚ᩷;Ll/᩸ۖ;)V
    .locals 1

    .line 1246
    iget-object v0, p0, Ll/֨ۚ᩷;->ᩴۧ:Ll/᩸ۖ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    .line 1247
    iput-object p1, p0, Ll/֨ۚ᩷;->ᩴۧ:Ll/᩸ۖ;

    .line 1248
    iput-object p1, p0, Ll/֨ۚ᩷;->᩸ۧ:Landroid/view/MenuItem;

    .line 1249
    iput-object p1, p0, Ll/֨ۚ᩷;->ۗۧ:Landroid/view/MenuItem;

    .line 1250
    iput-object p1, p0, Ll/֨ۚ᩷;->᩷ۧ:Landroid/view/MenuItem;

    .line 1251
    iput-object p1, p0, Ll/֨ۚ᩷;->ۤۧ:Landroid/widget/FrameLayout;

    .line 1252
    iput-object p1, p0, Ll/֨ۚ᩷;->ۨۧ:Landroid/widget/TextView;

    .line 1253
    iput-object p1, p0, Ll/֨ۚ᩷;->۫ۧ:Landroid/widget/FrameLayout;

    :cond_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/֨ۚ᩷;ZI)V
    .locals 0

    .line 0
    invoke-direct {p0, p2, p1}, Ll/֨ۚ᩷;->֫(IZ)V

    return-void
.end method

.method public static ֫(Ll/֫᩹᩷;Ll/ܰܺܳ;Ll/ᩳۜܳ;Ll/ᩴܿܳ;Ljava/lang/String;Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 14

    move-object v0, p1

    const-string v1, "local"

    .line 248
    invoke-virtual {p1}, Ll/ܰܺܳ;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    .line 61
    instance-of v1, v0, Ll/ۖۧ᩻;

    const v2, 0x7f120711

    if-nez v1, :cond_2

    instance-of v1, v0, Ll/ۗۢ᩻;

    if-nez v1, :cond_2

    instance-of v1, v0, Ll/᩵ۙ᩻;

    if-nez v1, :cond_2

    instance-of v1, v0, Ll/ܿ᩸᩻;

    if-nez v1, :cond_2

    instance-of v1, v0, Ll/ۖۛܳ;

    if-eqz v1, :cond_0

    goto :goto_1

    .line 250
    :cond_0
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll/ܽ᩷ܳ;->֫(J)V

    goto :goto_0

    .line 251
    :cond_1
    invoke-static {v2}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    :cond_2
    :goto_1
    const/4 v1, 0x0

    if-eqz v9, :cond_3

    .line 259
    :try_start_0
    sget-object v0, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    :goto_2
    move-object v1, v0

    goto :goto_3

    .line 260
    :cond_3
    invoke-virtual {p1}, Ll/ܰܺܳ;->֫()[B

    move-result-object v0

    const/4 v3, 0x1

    invoke-static {v0, v3}, Ll/ۨܺܳ;->֫([BZ)Ll/ܰܺܳ;

    move-result-object v0

    goto :goto_2

    .line 261
    :goto_3
    invoke-virtual/range {p3 .. p4}, Ll/ᩴܿܳ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, p4

    .line 262
    invoke-static {v0, v6}, Ll/ۜܿܳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_4

    .line 266
    new-instance v13, Ll/ۚۚ᩷;

    .line 267
    invoke-interface/range {p2 .. p2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v3, "multipart/related"

    .line 268
    invoke-interface/range {p2 .. p2}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/֨ᩳܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    const/4 v11, 0x0

    const/4 v12, 0x1

    move-object v3, v13

    move-object v4, v1

    move-object/from16 v5, p4

    invoke-direct/range {v3 .. v12}, Ll/ۚۚ᩷;-><init>(Ll/ܰܺܳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLl/ܶ᩵ܿ;Z)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    move-object/from16 v0, p5

    .line 270
    :try_start_1
    invoke-static {v13, v0}, Ll/ۚۚ᩷;->֫(Ll/ۚۚ᩷;Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v0, p0

    move-object/from16 v1, p6

    .line 278
    invoke-static {p0, v13, v1}, Ll/֨ۚ᩷;->֫(Landroid/app/Activity;Ll/ۚۚ᩷;Ljava/lang/Runnable;)V

    return-void

    :cond_4
    move-object/from16 v0, p5

    .line 264
    :try_start_2
    new-instance v3, Ljava/lang/IllegalArgumentException;

    const-string v4, "Invalid HTML preview path"

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    nop

    goto :goto_4

    :catch_1
    move-object/from16 v0, p5

    .line 310
    :goto_4
    instance-of v3, v1, Ljava/lang/AutoCloseable;

    if-eqz v3, :cond_5

    check-cast v1, Ljava/lang/AutoCloseable;

    .line 312
    :try_start_3
    check-cast v1, Ljava/lang/AutoCloseable;

    invoke-static {v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/AutoCloseable;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 273
    :catch_2
    :cond_5
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll/ܽ᩷ܳ;->֫(J)V

    goto :goto_5

    .line 274
    :cond_6
    invoke-static {v2}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public static ֫(Ll/ۚۚ᩷;Ljava/lang/String;)V
    .locals 1

    .line 323
    invoke-static {p0}, Ll/ۚۚ᩷;->֫(Ll/ۚۚ᩷;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Ll/֨ۚ᩷;->ۧܽ:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1, p0}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 324
    invoke-virtual {p0}, Ll/ۚۚ᩷;->close()V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Ll/ᩴܿܳ;Ljava/lang/String;Ll/ۤᩳܳ;)V
    .locals 7

    .line 141
    invoke-virtual {p0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܽۢܳ;->᩹()Ll/ܰܺܳ;

    move-result-object v1

    .line 142
    invoke-static {p0}, Ll/ᩴܿܳ;->֫(Ll/ܽۢܳ;)Ljava/util/List;

    move-result-object v5

    new-instance v6, Ll/ۜۚ᩷;

    invoke-direct {v6, p1, p4}, Ll/ۜۚ᩷;-><init>(Ll/ᩳۜܳ;Ll/ۤᩳܳ;)V

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 141
    invoke-static/range {v0 .. v6}, Ll/֨ۚ᩷;->֫(Ll/֫᩹᩷;Ll/ܰܺܳ;Ll/ᩳۜܳ;Ll/ᩴܿܳ;Ljava/lang/String;Ljava/util/List;Ljava/lang/Runnable;)V

    return-void
.end method

.method private ֫(Ll/᩵ۚ᩷;)V
    .locals 3

    .line 708
    iget-boolean v0, p0, Ll/֨ۚ᩷;->֨ۧ:Z

    .line 888
    iget-boolean v1, p1, Ll/᩵ۚ᩷;->֫:Z

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 709
    :goto_0
    iput-boolean v1, p0, Ll/֨ۚ᩷;->֨ۧ:Z

    .line 710
    iput-object p1, p0, Ll/֨ۚ᩷;->᩵ۧ:Ll/᩵ۚ᩷;

    .line 711
    iget-object v1, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-eqz v1, :cond_1

    .line 712
    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    .line 880
    iget-boolean v2, p1, Ll/᩵ۚ᩷;->֫:Z

    xor-int/lit8 v2, v2, 0x1

    .line 712
    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 714
    :cond_1
    iget-object v1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    if-eqz v1, :cond_2

    .line 715
    iget-object p1, p1, Ll/᩵ۚ᩷;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ll/ۢᩴ;->setSubtitle(Ljava/lang/CharSequence;)V

    :cond_2
    if-eqz v0, :cond_3

    .line 717
    iget-object p1, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    if-eqz p1, :cond_3

    .line 718
    invoke-static {p1}, Ll/ۚۚ᩷;->ܺ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    :cond_3
    return-void
.end method

.method private ֫(Z)V
    .locals 3

    .line 1305
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-nez v0, :cond_0

    goto :goto_3

    .line 1308
    :cond_0
    iget v0, p0, Ll/֨ۚ᩷;->ۛۧ:I

    .line 1343
    sget-object v1, Ll/֨ۚ᩷;->ܽܽ:[I

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    :goto_0
    const/16 v2, 0x11

    if-ge p1, v2, :cond_2

    .line 1344
    aget v2, v1, p1

    if-le v2, v0, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 1349
    :cond_2
    sget v2, Ll/֨ۚ᩷;->ܰۧ:I

    goto :goto_2

    :cond_3
    const/16 p1, 0x10

    :goto_1
    if-ltz p1, :cond_5

    .line 1352
    aget v2, v1, p1

    if-ge v2, v0, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    .line 1356
    :cond_5
    sget v2, Ll/֨ۚ᩷;->۟ۧ:I

    :goto_2
    if-ne v2, v0, :cond_6

    :goto_3
    return-void

    .line 1313
    :cond_6
    invoke-direct {p0, v2}, Ll/֨ۚ᩷;->ܿ(I)V

    .line 1314
    invoke-direct {p0}, Ll/֨ۚ᩷;->᩺()V

    return-void
.end method

.method public static ֫(Ll/֨ۚ᩷;Landroid/view/MenuItem;)Z
    .locals 4

    .line 1272
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1275
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    .line 1276
    iget-object p0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {p0}, Landroid/webkit/WebView;->reload()V

    return v2

    .line 1278
    :cond_1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_3

    .line 1279
    invoke-direct {p0}, Ll/֨ۚ᩷;->۟()V

    .line 1280
    iget-object p1, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 1281
    iget-object p1, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {p1}, Ll/ۚۚ᩷;->ۖ(Ll/ۚۚ᩷;)Ll/ܰܺܳ;

    move-result-object p1

    instance-of p1, p1, Ll/ۗۢ᩻;

    if-eqz p1, :cond_2

    .line 1282
    iget-object p1, p0, Ll/֨ۚ᩷;->᩹ۧ:Ll/ۖܿܳ;

    invoke-virtual {p1}, Ll/ۖܿܳ;->֫()V

    .line 1283
    iget-object p1, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {p1}, Ll/ۚۚ᩷;->ܽ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙᩳܳ;->ۧ(Ljava/lang/String;)V

    :cond_2
    const/16 p1, 0x64

    .line 1285
    invoke-direct {p0, p1, v1}, Ll/֨ۚ᩷;->֫(IZ)V

    return v2

    .line 1287
    :cond_3
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/4 v3, 0x5

    if-ne v0, v3, :cond_4

    .line 1288
    invoke-direct {p0, v2}, Ll/֨ۚ᩷;->ۧ(Z)V

    return v2

    .line 1290
    :cond_4
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/4 v3, 0x3

    if-ne v0, v3, :cond_6

    .line 1291
    invoke-direct {p0}, Ll/֨ۚ᩷;->ܰ()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 1292
    iget-object p1, p0, Ll/֨ۚ᩷;->ۢۧ:Ll/ܳܿܳ;

    invoke-static {p0}, Ll/᩸֡᩷;->֫(Landroid/content/Context;)Z

    move-result p0

    invoke-virtual {p1, p0}, Ll/ܳܿܳ;->֫(Z)V

    :cond_5
    return v2

    .line 1295
    :cond_6
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_7

    .line 1297
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return v2

    :cond_7
    :goto_0
    return v1
.end method

.method private ֫֫()V
    .locals 3

    .line 1448
    iget-object v0, p0, Ll/֨ۚ᩷;->ܿۧ:Landroid/view/MenuItem;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 1449
    iget-object v2, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 1451
    :cond_1
    iget-object v0, p0, Ll/֨ۚ᩷;->ܳۧ:Landroid/view/MenuItem;

    if-eqz v0, :cond_3

    .line 1452
    iget-object v2, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/webkit/WebView;->canGoForward()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x1

    :cond_2
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 1454
    :cond_3
    iget-object v0, p0, Ll/֨ۚ᩷;->᩸ۧ:Landroid/view/MenuItem;

    if-eqz v0, :cond_4

    .line 1455
    iget-boolean v1, p0, Ll/֨ۚ᩷;->ۡۧ:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 1457
    :cond_4
    iget-object v0, p0, Ll/֨ۚ᩷;->ۗۧ:Landroid/view/MenuItem;

    if-eqz v0, :cond_5

    .line 1458
    iget-boolean v1, p0, Ll/֨ۚ᩷;->ۡۧ:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 1460
    :cond_5
    iget-object v0, p0, Ll/֨ۚ᩷;->᩷ۧ:Landroid/view/MenuItem;

    if-eqz v0, :cond_6

    .line 1461
    invoke-direct {p0}, Ll/֨ۚ᩷;->ܰ()Z

    move-result v1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 1463
    :cond_6
    iget v0, p0, Ll/֨ۚ᩷;->ۛۧ:I

    invoke-direct {p0, v0}, Ll/֨ۚ᩷;->ܿ(I)V

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/֨ۚ᩷;)Landroid/webkit/WebView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    return-object p0
.end method

.method private ۟()V
    .locals 2

    .line 679
    iget-object v0, p0, Ll/֨ۚ᩷;->ۚۧ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 680
    :try_start_0
    iput-object v1, p0, Ll/֨ۚ᩷;->֡ۧ:Ll/֡ۚ᩷;

    .line 681
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static bridge synthetic ۡ(Ll/֨ۚ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/֨ۚ᩷;->۟()V

    return-void
.end method

.method public static bridge synthetic ۢ(Ll/֨ۚ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/֨ۚ᩷;->᩺()V

    return-void
.end method

.method public static ۧ(Landroid/net/Uri;)Ljava/lang/String;
    .locals 3

    .line 739
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    const-string v2, "http"

    .line 741
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "https"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 725
    :cond_0
    invoke-virtual {p0}, Landroid/net/Uri;->getEncodedAuthority()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v2, 0x40

    .line 729
    invoke-virtual {p0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    if-ltz v2, :cond_2

    add-int/lit8 v2, v2, 0x1

    .line 731
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 733
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    :goto_0
    move-object p0, v1

    :cond_3
    if-nez p0, :cond_4

    goto :goto_1

    .line 745
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "://"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_1
    return-object v1
.end method

.method public static ۧ(Ll/֨ۚ᩷;)V
    .locals 1

    .line 1427
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1428
    iget-object p0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {p0}, Landroid/webkit/WebView;->goBack()V

    return-void

    .line 1430
    :cond_0
    invoke-super {p0}, Ll/᩻ܽ;->onBackPressed()V

    return-void
.end method

.method public static ۧ(Ll/֨ۚ᩷;Landroid/net/Uri;)V
    .locals 3

    .line 686
    iget-object v0, p0, Ll/֨ۚ᩷;->᩵ۧ:Ll/᩵ۚ᩷;

    .line 687
    iget-object v1, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v1}, Ll/ۚۚ᩷;->ᩳ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v1

    .line 688
    iget-object v2, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v2}, Ll/ۚۚ᩷;->᩷(Ll/ۚۚ᩷;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v2}, Ll/ۚۚ᩷;->ܽ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 687
    :goto_0
    invoke-static {p1, v1, v2, v0}, Ll/֨ۚ᩷;->֫(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ll/᩵ۚ᩷;)Ll/᩵ۚ᩷;

    move-result-object p1

    .line 689
    iget-boolean v0, p0, Ll/֨ۚ᩷;->֨ۧ:Z

    if-eqz v0, :cond_1

    .line 858
    iget-boolean v0, p1, Ll/᩵ۚ᩷;->֫:Z

    if-nez v0, :cond_1

    .line 691
    invoke-direct {p0, p1}, Ll/֨ۚ᩷;->֫(Ll/᩵ۚ᩷;)V

    :cond_1
    return-void
.end method

.method private ۧ(Z)V
    .locals 3

    .line 1146
    iput-boolean p1, p0, Ll/֨ۚ᩷;->᩻ۧ:Z

    .line 1147
    iget-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/16 v2, 0x8

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1148
    iget-object v0, p0, Ll/֨ۚ᩷;->ܶۧ:Landroid/widget/ProgressBar;

    iget-boolean v2, p0, Ll/֨ۚ᩷;->ۡۧ:Z

    if-eqz v2, :cond_1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1149
    iget-object v0, p0, Ll/֨ۚ᩷;->ۜۧ:Ll/᩶ۚ᩷;

    invoke-virtual {v0, p1}, Ll/᩶ۚ᩷;->֫(Z)V

    .line 1150
    invoke-direct {p0}, Ll/֨ۚ᩷;->ۨ()V

    .line 1151
    iget-object p1, p0, Ll/֨ۚ᩷;->۠ۧ:Landroid/view/View;

    invoke-static {p1}, Ll/ܿ᩺;->᩵(Landroid/view/View;)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/֨ۚ᩷;Ljava/lang/String;)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/֨ۚ᩷;->ᩳ(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private ۨ()V
    .locals 3

    .line 1155
    invoke-virtual {p0}, Ll/ۗܺ᩷;->᩸()Ll/۫ܰ;

    move-result-object v0

    .line 1156
    iget-boolean v1, p0, Ll/֨ۚ᩷;->᩻ۧ:Z

    const/4 v2, 0x7

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    .line 1157
    invoke-virtual {v0, v1}, Ll/۫ܰ;->ۧ(I)V

    .line 1158
    invoke-virtual {v0, v2}, Ll/۫ܰ;->֫(I)V

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 1160
    invoke-virtual {v0, v1}, Ll/۫ܰ;->ۧ(I)V

    .line 1161
    invoke-virtual {v0, v2}, Ll/۫ܰ;->ܽ(I)V

    return-void
.end method

.method private ܰ()Z
    .locals 2

    .line 1468
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 1469
    iget-object v1, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    if-eqz v1, :cond_1

    invoke-static {v1}, Ll/ۚۚ᩷;->ۜ(Ll/ۚۚ᩷;)I

    move-result v1

    if-gez v1, :cond_1

    .line 1470
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v1}, Ll/ۚۚ᩷;->ܽ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۙᩳܳ;->֫(Landroid/net/Uri;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ܳ(Ll/֨ۚ᩷;)Ll/ܳܿܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۚ᩷;->ۢۧ:Ll/ܳܿܳ;

    return-object p0
.end method

.method public static ܽ(Ll/֨ۚ᩷;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    .line 971
    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 972
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :goto_0
    return-object v0

    .line 975
    :cond_1
    iget-object v1, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v1}, Ll/ۚۚ᩷;->ᩳ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v1

    .line 976
    iget-object v2, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v2}, Ll/ۚۚ᩷;->᩷(Ll/ۚۚ᩷;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->ܽ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    iget-object v2, p0, Ll/֨ۚ᩷;->᩵ۧ:Ll/᩵ۚ᩷;

    .line 975
    invoke-static {p1, v1, v0, v2}, Ll/֨ۚ᩷;->֫(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ll/᩵ۚ᩷;)Ll/᩵ۚ᩷;

    move-result-object p1

    .line 977
    iget-object p0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {p0}, Ll/ۚۚ᩷;->ܺ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object p0

    .line 895
    iget-boolean v0, p1, Ll/᩵ۚ᩷;->֫:Z

    if-eqz v0, :cond_3

    return-object p0

    :cond_3
    iget-object p0, p1, Ll/᩵ۚ᩷;->ۧ:Ljava/lang/String;

    return-object p0
.end method

.method private ܽ(Landroid/net/Uri;)V
    .locals 4

    .line 638
    iget-object v1, p0, Ll/֨ۚ᩷;->᩵ۧ:Ll/᩵ۚ᩷;

    .line 639
    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->ᩳ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v0

    .line 640
    iget-object v2, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v2}, Ll/ۚۚ᩷;->᩷(Ll/ۚۚ᩷;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v2, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v2}, Ll/ۚۚ᩷;->ܽ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    .line 639
    :goto_0
    invoke-static {p1, v0, v2, v1}, Ll/֨ۚ᩷;->֫(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ll/᩵ۚ᩷;)Ll/᩵ۚ᩷;

    move-result-object v2

    if-eqz p1, :cond_2

    .line 641
    iget-boolean v0, v1, Ll/᩵ۚ᩷;->֫:Z

    if-nez v0, :cond_2

    iget-boolean v0, v2, Ll/᩵ۚ᩷;->֫:Z

    if-eqz v0, :cond_2

    .line 875
    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/net/Uri$Builder;->fragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    .line 650
    iget-object v0, p0, Ll/֨ۚ᩷;->ۚۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 651
    :try_start_0
    iget-object v1, p0, Ll/֨ۚ᩷;->֡ۧ:Ll/֡ۚ᩷;

    if-eqz v1, :cond_1

    .line 652
    iget-object v1, v1, Ll/֡ۚ᩷;->֫:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 653
    monitor-exit v0

    return-void

    .line 655
    :cond_1
    new-instance v1, Ll/֡ۚ᩷;

    invoke-direct {v1, p1}, Ll/֡ۚ᩷;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Ll/֨ۚ᩷;->֡ۧ:Ll/֡ۚ᩷;

    .line 656
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 643
    :cond_2
    iget-boolean p1, v2, Ll/᩵ۚ᩷;->֫:Z

    if-eqz p1, :cond_4

    iget-boolean p1, v1, Ll/᩵ۚ᩷;->֫:Z

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    return-void

    .line 644
    :cond_4
    :goto_1
    invoke-direct {p0}, Ll/֨ۚ᩷;->۟()V

    return-void
.end method

.method private ܽ(Ljava/lang/String;)V
    .locals 7

    .line 1475
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-eqz v0, :cond_4

    invoke-direct {p0, p1}, Ll/֨ۚ᩷;->ᩳ(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_3

    .line 1476
    :cond_0
    invoke-static {p0}, Ll/᩸֡᩷;->֫(Landroid/content/Context;)Z

    move-result p1

    .line 1477
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-eqz p1, :cond_1

    const/16 v1, 0x11

    const/16 v2, 0x17

    const/16 v3, 0xd

    invoke-static {v3, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 1478
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-static {v0, p1}, Ll/֨ۚ᩷;->֫(Landroid/webkit/WebView;Z)V

    .line 1479
    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->ᩳ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v1}, Ll/ۚۚ᩷;->ܿ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۜܿܳ;->֫(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1480
    iget-object v1, p0, Ll/֨ۚ᩷;->ۖۧ:Landroid/os/Bundle;

    const-string v2, "null"

    if-nez v1, :cond_2

    move-object v3, v2

    goto :goto_1

    .line 1482
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "{x:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "x"

    .line 1481
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, ",y:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "y"

    .line 1482
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, "}"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1483
    :goto_1
    iget-object v4, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v4}, Ll/ۚۚ᩷;->᩻(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_2

    .line 1484
    :cond_3
    invoke-static {v4}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1485
    :goto_2
    iget-object v4, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "(function(){if(location.href.split(\'#\')[0]!=="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1486
    invoke-static {v0}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "||!window.__mtMarkdownPreview)return false;window.__mtMarkdownPreview.apply("

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ","

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->ۜ(Ll/ۚۚ᩷;)I

    move-result v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ",function(state){window.__mtMarkdownState.save("

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Ll/֨ۚ᩷;->ۘۧ:Ll/ᩴۚ᩷;

    invoke-static {p1}, Ll/ᩴۚ᩷;->֫(Ll/ᩴۚ᩷;)Ljava/lang/String;

    move-result-object p1

    .line 1489
    invoke-static {p1}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ",state);});return true;})()"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ll/ܳۚ᩷;

    invoke-direct {v0, p0, v1}, Ll/ܳۚ᩷;-><init>(Ll/֨ۚ᩷;Landroid/os/Bundle;)V

    .line 1485
    invoke-virtual {v4, p1, v0}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    :cond_4
    :goto_3
    return-void
.end method

.method public static synthetic ܽ(Ll/֨ۚ᩷;)V
    .locals 1

    const/4 v0, 0x0

    .line 1262
    invoke-direct {p0, v0}, Ll/֨ۚ᩷;->֫(Z)V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/֨ۚ᩷;Landroid/net/Uri;)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/֨ۚ᩷;->ᩳ(Landroid/net/Uri;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/֨ۚ᩷;)Ll/᩶ۚ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۚ᩷;->ۜۧ:Ll/᩶ۚ᩷;

    return-object p0
.end method

.method private ܿ(I)V
    .locals 3

    .line 1329
    invoke-static {p1}, Ll/֨ۚ᩷;->ᩳ(I)I

    move-result p1

    iput p1, p0, Ll/֨ۚ᩷;->ۛۧ:I

    .line 1330
    iget-object v0, p0, Ll/֨ۚ᩷;->ۨۧ:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 1410
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "%"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1331
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1333
    :cond_0
    iget-object p1, p0, Ll/֨ۚ᩷;->ۤۧ:Landroid/widget/FrameLayout;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 1334
    iget v1, p0, Ll/֨ۚ᩷;->ۛۧ:I

    sget v2, Ll/֨ۚ᩷;->۟ۧ:I

    if-le v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 1336
    :cond_2
    iget-object p1, p0, Ll/֨ۚ᩷;->۫ۧ:Landroid/widget/FrameLayout;

    if-eqz p1, :cond_4

    .line 1337
    iget v1, p0, Ll/֨ۚ᩷;->ۛۧ:I

    sget v2, Ll/֨ۚ᩷;->ܰۧ:I

    if-ge v1, v2, :cond_3

    const/4 v0, 0x1

    :cond_3
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    :cond_4
    return-void
.end method

.method public static ᩳ(I)I
    .locals 5

    .line 1397
    sget v0, Ll/֨ۚ᩷;->ܰۧ:I

    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    sget v0, Ll/֨ۚ᩷;->۟ۧ:I

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x11

    if-ge v1, v2, :cond_1

    .line 1399
    sget-object v2, Ll/֨ۚ᩷;->ܽܽ:[I

    aget v2, v2, v1

    sub-int v3, v2, p0

    .line 1400
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    sub-int v4, v0, p0

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    if-ge v3, v4, :cond_0

    move v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static synthetic ᩳ(Ll/֨ۚ᩷;)V
    .locals 1

    const/4 v0, 0x0

    .line 1130
    invoke-direct {p0, v0}, Ll/֨ۚ᩷;->ۧ(Z)V

    return-void
.end method

.method public static ᩳ(Ll/֨ۚ᩷;Landroid/net/Uri;)V
    .locals 1

    .line 611
    iget-boolean v0, p0, Ll/֨ۚ᩷;->ۡۧ:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    if-eqz v0, :cond_1

    invoke-static {v0}, Ll/ۚۚ᩷;->ۖ(Ll/ۚۚ᩷;)Ll/ܰܺܳ;

    move-result-object v0

    instance-of v0, v0, Ll/ۗۢ᩻;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->ᩳ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v0

    .line 613
    invoke-static {p1, v0}, Ll/ۜܿܳ;->֫(Landroid/net/Uri;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {p0}, Ll/ۚۚ᩷;->ܽ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object p0

    .line 614
    invoke-static {p1, p0}, Ll/ۙᩳܳ;->֫(Landroid/net/Uri;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const p0, 0x7f120711

    .line 615
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_1
    return-void
.end method

.method private ᩳ(Landroid/net/Uri;)Z
    .locals 4

    .line 1096
    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->ᩳ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v0

    .line 1097
    iget-object v1, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v1}, Ll/ۚۚ᩷;->᩷(Ll/ۚۚ᩷;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v1}, Ll/ۚۚ᩷;->ܽ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    .line 1105
    :goto_0
    invoke-static {p1, v0}, Ll/ۜܿܳ;->֫(Landroid/net/Uri;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 1106
    invoke-static {p1, v1}, Ll/ۙᩳܳ;->֫(Landroid/net/Uri;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_3

    .line 1109
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    goto :goto_2

    .line 1113
    :cond_2
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "about"

    .line 1114
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "data"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "blob"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "javascript"

    .line 1115
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "cid"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    const-string v3, "http"

    .line 1118
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "https"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 725
    :cond_4
    invoke-virtual {p1}, Landroid/net/Uri;->getEncodedAuthority()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    const/16 v0, 0x40

    .line 729
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-ltz v0, :cond_6

    add-int/2addr v0, v1

    .line 731
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 733
    :cond_6
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_1

    :cond_7
    move-object v2, p1

    :goto_1
    if-nez v2, :cond_9

    :cond_8
    :goto_2
    return v1

    :cond_9
    :goto_3
    const/4 p1, 0x0

    return p1
.end method

.method private ᩳ(Ljava/lang/String;)Z
    .locals 2

    .line 1495
    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ll/ۚۚ᩷;->ۜ(Ll/ۚۚ᩷;)I

    move-result v0

    if-ltz v0, :cond_0

    if-eqz p1, :cond_0

    .line 1496
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/net/Uri$Builder;->fragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->ᩳ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v1}, Ll/ۚۚ᩷;->ܿ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v1

    .line 1497
    invoke-static {v0, v1}, Ll/ۜܿܳ;->֫(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ᩷(Ll/֨ۚ᩷;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    return-void
.end method

.method private ᩺()V
    .locals 6

    .line 1319
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_0

    .line 1322
    :cond_0
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    .line 1323
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v0, v1

    .line 1322
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1324
    iget-object v2, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    iget v3, p0, Ll/֨ۚ᩷;->ۛۧ:I

    .line 1362
    invoke-static {v3}, Ll/֨ۚ᩷;->ᩳ(I)I

    move-result v3

    const-string v4, "(function(percent,hostWidth){var root=document.documentElement,head=document.head;if(!root||!head){return;}var key=\'__mt_html_preview_viewport_7d26a6c9__\';var state=root[key];if(!state){if(percent===100){return;}var nodes=[],content=\'\',metas=head.getElementsByTagName(\'meta\');for(var i=0;i<metas.length;i++){if((metas[i].name||\'\').toLowerCase()===\'viewport\'){nodes.push(metas[i]);content=metas[i].getAttribute(\'content\')||\'\';}}state={nodes:nodes,width:root.clientWidth||window.innerWidth||hostWidth,hostWidth:hostWidth,scale:window.visualViewport?window.visualViewport.scale:0,fluid:/width\\s*=\\s*device-width/i.test(content)||(!/width\\s*=/i.test(content)&&/initial-scale\\s*=/i.test(content))};if(!nodes.length){var meta=document.createElement(\'meta\');meta.name=\'viewport\';head.appendChild(meta);nodes.push(meta);}Object.defineProperty(root,key,{value:state,configurable:true});}var baseWidth=state.fluid?state.width*hostWidth/state.hostWidth:state.width;var width=Math.max(1,Math.round(baseWidth*100/percent));var scale=hostWidth/width;if(state.scale>0){scale*=state.scale*state.width/state.hostWidth;}var content=\'width=\'+width+\',initial-scale=\'+scale+\',minimum-scale=\'+Math.min(scale,0.1)+\',maximum-scale=\'+Math.max(scale,10);for(var i=0;i<state.nodes.length;i++){state.nodes[i].setAttribute(\'content\',content);}})("

    const-string v5, ","

    .line 0
    invoke-static {v3, v4, v5}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 1392
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ");"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 1324
    invoke-virtual {v2, v0, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ᩻(Ll/֨ۚ᩷;)Ll/ۚۚ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    return-object p0
.end method


# virtual methods
.method public final onBackPressed()V
    .locals 3

    .line 1419
    iget-object v0, p0, Ll/֨ۚ᩷;->ۢۧ:Ll/ܳܿܳ;

    if-eqz v0, :cond_1

    new-instance v1, Ll/۟ۤᩳ;

    const/4 v2, 0x7

    invoke-direct {v1, v2, p0}, Ll/۟ۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ܳܿܳ;->֫(Ll/۟ۤᩳ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 1427
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1428
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    return-void

    .line 1430
    :cond_2
    invoke-super {p0}, Ll/᩻ܽ;->onBackPressed()V

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1176
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1178
    iget-object p1, p0, Ll/֨ۚ᩷;->۠ۧ:Landroid/view/View;

    if-eqz p1, :cond_0

    .line 1179
    iget-object p1, p0, Ll/֨ۚ᩷;->ۜۧ:Ll/᩶ۚ᩷;

    iget-boolean v0, p0, Ll/֨ۚ᩷;->᩻ۧ:Z

    invoke-virtual {p1, v0}, Ll/᩶ۚ᩷;->֫(Z)V

    .line 1180
    invoke-direct {p0}, Ll/֨ۚ᩷;->ۨ()V

    .line 1181
    iget-object p1, p0, Ll/֨ۚ᩷;->۠ۧ:Landroid/view/View;

    invoke-static {p1}, Ll/ܿ᩺;->᩵(Landroid/view/View;)V

    .line 1183
    :cond_0
    iget-object p1, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/֨ۚ᩷;->ܽ(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 12

    .line 342
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    .line 343
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "session_token"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֨ۚ᩷;->ۙۧ:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    .line 344
    :cond_0
    sget-object v2, Ll/֨ۚ᩷;->ۧܽ:Ll/ۧۤᩴ;

    invoke-virtual {v2, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚۚ᩷;

    :goto_0
    iput-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    if-nez v0, :cond_1

    const p1, 0x7f120711

    .line 346
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 347
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 350
    :cond_1
    invoke-static {v0}, Ll/ۚۚ᩷;->ᩴ(Ll/ۚۚ᩷;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    const-string v2, "markdown_scroll"

    .line 352
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    iput-object v2, p0, Ll/֨ۚ᩷;->ۖۧ:Landroid/os/Bundle;

    const-string v2, "zoom_percent"

    const/16 v3, 0x64

    .line 353
    invoke-virtual {p1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ll/֨ۚ᩷;->ᩳ(I)I

    move-result v2

    iput v2, p0, Ll/֨ۚ᩷;->ۛۧ:I

    const-string v2, "preview_resources_allowed"

    .line 354
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 355
    sget-object v2, Ll/֨ۚ᩷;->֫ܽ:Ll/᩵ۚ᩷;

    goto :goto_1

    .line 356
    :cond_2
    new-instance v2, Ll/᩵ۚ᩷;

    const-string v3, "source_label"

    .line 357
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Ll/᩵ۚ᩷;-><init>(ZLjava/lang/String;)V

    :goto_1
    iput-object v2, p0, Ll/֨ۚ᩷;->᩵ۧ:Ll/᩵ۚ᩷;

    :cond_3
    const v2, 0x7f0d0031

    .line 360
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const v2, 0x7f0a063a

    .line 361
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۢᩴ;

    iput-object v2, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 362
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 363
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 364
    iget-object v2, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v3, Ll/ۢۚ᩷;

    invoke-direct {v3, p0}, Ll/ۢۚ᩷;-><init>(Ll/֨ۚ᩷;)V

    invoke-virtual {v2, v3}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 365
    iget-object v2, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v2}, Ll/ۚۚ᩷;->ܺ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    const v2, 0x7f0a0270

    .line 366
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ProgressBar;

    iput-object v2, p0, Ll/֨ۚ᩷;->ܶۧ:Landroid/widget/ProgressBar;

    const v2, 0x7f0a0271

    .line 1127
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Ll/֨ۚ᩷;->۠ۧ:Landroid/view/View;

    const v2, 0x7f0a026f

    .line 1128
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    .line 1129
    new-instance v3, Ll/᩶ۚ᩷;

    sget-object v4, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-direct {v3, v2, v4}, Ll/᩶ۚ᩷;-><init>(Landroid/view/View;Ll/۫ۤۡ;)V

    iput-object v3, p0, Ll/֨ۚ᩷;->ۜۧ:Ll/᩶ۚ᩷;

    .line 1130
    new-instance v3, Ll/۬ܶ᩷;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v4}, Ll/۬ܶ᩷;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v3, 0x7f120457

    .line 1131
    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ᩴᩴ;->֫(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 1132
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-static {v2, v0}, Ll/ۙ᩺;->֫(Landroid/view/Window;Z)V

    .line 1133
    iget-object v2, p0, Ll/֨ۚ᩷;->۠ۧ:Landroid/view/View;

    new-instance v3, Ll/ܺ֨᩷;

    invoke-direct {v3, p0}, Ll/ܺ֨᩷;-><init>(Ll/ۗܺ᩷;)V

    invoke-static {v2, v3}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۨ;)V

    .line 369
    new-instance v2, Ll/ۖܿܳ;

    iget-object v3, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v3}, Ll/ۚۚ᩷;->ۖ(Ll/ۚۚ᩷;)Ll/ܰܺܳ;

    move-result-object v6

    iget-object v3, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v3}, Ll/ۚۚ᩷;->ۢ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v7

    iget-object v3, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v3}, Ll/ۚۚ᩷;->ܳ(Ll/ۚۚ᩷;)Z

    move-result v8

    .line 371
    iget-object v3, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v3}, Ll/ۚۚ᩷;->᩷(Ll/ۚۚ᩷;)Z

    move-result v3

    if-eqz v3, :cond_4

    move-object v9, v1

    goto :goto_2

    :cond_4
    iget-object v3, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v3}, Ll/ۚۚ᩷;->ۡ(Ll/ۚۚ᩷;)Ll/ܶ᩵ܿ;

    move-result-object v3

    move-object v9, v3

    :goto_2
    iget-object v3, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v3}, Ll/ۚۚ᩷;->ۘ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v10

    iget-object v3, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v3}, Ll/ۚۚ᩷;->ۧ(Ll/ۚۚ᩷;)Z

    move-result v11

    move-object v4, v2

    move-object v5, p0

    invoke-direct/range {v4 .. v11}, Ll/ۖܿܳ;-><init>(Ll/֨ۚ᩷;Ll/ܰܺܳ;Ljava/lang/String;ZLl/ܶ᩵ܿ;Ljava/lang/String;Z)V

    iput-object v2, p0, Ll/֨ۚ᩷;->᩹ۧ:Ll/ۖܿܳ;

    .line 373
    iget-object v2, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v2}, Ll/ۚۚ᩷;->ۜ(Ll/ۚۚ᩷;)I

    move-result v2

    if-ltz v2, :cond_5

    .line 374
    new-instance v2, Ll/ۗܿܳ;

    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    invoke-direct {v2, v3}, Ll/ۗܿܳ;-><init>(Landroid/content/res/AssetManager;)V

    iput-object v2, p0, Ll/֨ۚ᩷;->ܺۧ:Ll/ۗܿܳ;

    .line 376
    :cond_5
    new-instance v2, Ll/᩵۟ۧ;

    invoke-direct {v2}, Ll/᩵۟ۧ;-><init>()V

    iget-object v3, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v3}, Ll/ۚۚ᩷;->ᩳ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v3

    .line 377
    invoke-virtual {v2, v3}, Ll/᩵۟ۧ;->֫(Ljava/lang/String;)V

    .line 378
    iget-object v3, p0, Ll/֨ۚ᩷;->᩹ۧ:Ll/ۖܿܳ;

    .line 379
    invoke-virtual {v2, v3}, Ll/᩵۟ۧ;->֫(Ll/֡۟ۧ;)V

    .line 380
    invoke-virtual {v2}, Ll/᩵۟ۧ;->֫()Ll/֨۟ۧ;

    move-result-object v2

    iput-object v2, p0, Ll/֨ۚ᩷;->ᩳۧ:Ll/֨۟ۧ;

    .line 383
    new-instance v2, Ll/ܺۚ᩷;

    invoke-direct {v2, p0, p0}, Ll/ܺۚ᩷;-><init>(Ll/֨ۚ᩷;Ll/֨ۚ᩷;)V

    iput-object v2, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    .line 393
    iget-object v3, p0, Ll/֨ۚ᩷;->ۜۧ:Ll/᩶ۚ᩷;

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const v2, 0x7f0a026e

    .line 394
    invoke-virtual {p0, v2}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout;

    .line 395
    iget-object v3, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v5, -0x1

    invoke-direct {v4, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 398
    iget-object v2, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    new-instance v3, Ll/ۡۚ᩷;

    invoke-direct {v3, p0}, Ll/ۡۚ᩷;-><init>(Ll/֨ۚ᩷;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 404
    iget-object v2, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    .line 434
    iget-object v3, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v3}, Ll/ۚۚ᩷;->ۜ(Ll/ۚۚ᩷;)I

    move-result v3

    if-gez v3, :cond_6

    new-instance v3, Ll/ܳܿܳ;

    invoke-direct {v3, v2}, Ll/ܳܿܳ;-><init>(Landroid/webkit/WebView;)V

    iput-object v3, p0, Ll/֨ۚ᩷;->ۢۧ:Ll/ܳܿܳ;

    goto :goto_3

    .line 436
    :cond_6
    new-instance v3, Ll/ᩴۚ᩷;

    iget-object v4, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-direct {v3, v4}, Ll/ᩴۚ᩷;-><init>(Ll/ۚۚ᩷;)V

    iput-object v3, p0, Ll/֨ۚ᩷;->ۘۧ:Ll/ᩴۚ᩷;

    const-string v4, "__mtMarkdownState"

    .line 437
    invoke-virtual {v2, v3, v4}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 440
    :goto_3
    iget-object v3, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v3}, Ll/ۚۚ᩷;->ۜ(Ll/ۚۚ᩷;)I

    move-result v3

    if-ltz v3, :cond_7

    invoke-static {p0}, Ll/᩸֡᩷;->֫(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0x11

    const/16 v4, 0x17

    const/16 v5, 0xd

    .line 441
    invoke-static {v5, v3, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v5

    .line 440
    :cond_7
    invoke-virtual {v2, v5}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 442
    invoke-static {p0}, Ll/᩸֡᩷;->֫(Landroid/content/Context;)Z

    move-result v3

    invoke-static {v2, v3}, Ll/֨ۚ᩷;->֫(Landroid/webkit/WebView;Z)V

    .line 443
    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    const/4 v4, 0x1

    .line 444
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 446
    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    .line 447
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 448
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 449
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 450
    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 451
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 452
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 453
    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 454
    iget-object v5, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v5}, Ll/ۚۚ᩷;->᩷(Ll/ۚۚ᩷;)Z

    move-result v5

    invoke-virtual {v3, v5}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 455
    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 456
    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    .line 457
    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 458
    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 459
    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    .line 460
    iget-object v5, p0, Ll/֨ۚ᩷;->᩵ۧ:Ll/᩵ۚ᩷;

    .line 880
    iget-boolean v5, v5, Ll/᩵ۚ᩷;->֫:Z

    xor-int/2addr v4, v5

    .line 460
    invoke-virtual {v3, v4}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 490
    new-instance v3, Ll/ۖۚ᩷;

    invoke-direct {v3, p0}, Ll/ۖۚ᩷;-><init>(Ll/֨ۚ᩷;)V

    .line 461
    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 903
    new-instance v3, Ll/ۘۚ᩷;

    invoke-direct {v3, p0}, Ll/ۘۚ᩷;-><init>(Ll/֨ۚ᩷;)V

    .line 462
    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 463
    new-instance v3, Ll/ۨ֡᩷;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    if-eqz p1, :cond_8

    const-string v2, "fullscreen"

    .line 405
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v0, 0x1

    :cond_8
    invoke-direct {p0, v0}, Ll/֨ۚ᩷;->ۧ(Z)V

    .line 408
    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->᩷(Ll/ۚۚ᩷;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 409
    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->ۡ(Ll/ۚۚ᩷;)Ll/ܶ᩵ܿ;

    move-result-object v0

    if-nez v0, :cond_9

    .line 410
    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->ܽ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v2}, Ll/ۚۚ᩷;->ۖ(Ll/ۚۚ᩷;)Ll/ܰܺܳ;

    move-result-object v2

    iget-object v3, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v3}, Ll/ۚۚ᩷;->ۘ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v4}, Ll/ۚۚ᩷;->ܳ(Ll/ۚۚ᩷;)Z

    move-result v4

    invoke-static {v0, p0, v2, v3, v4}, Ll/ۙᩳܳ;->֫(Ljava/lang/String;Ll/֨ۚ᩷;Ll/ܰܺܳ;Ljava/lang/String;Z)Landroid/net/Uri;

    move-result-object v0

    goto :goto_4

    .line 412
    :cond_9
    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->ܽ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v2}, Ll/ۚۚ᩷;->ۡ(Ll/ۚۚ᩷;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-static {v0, p0, v2}, Ll/ۙᩳܳ;->֫(Ljava/lang/String;Ll/֨ۚ᩷;Ll/ܶ᩵ܿ;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_4

    .line 415
    :cond_a
    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v0}, Ll/ۚۚ᩷;->ᩳ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v2}, Ll/ۚۚ᩷;->ܿ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ll/ۜܿܳ;->֫(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_4
    if-nez p1, :cond_b

    move-object p1, v1

    goto :goto_5

    :cond_b
    const-string v2, "web_view"

    .line 417
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    :goto_5
    if-nez p1, :cond_c

    move-object p1, v1

    goto :goto_6

    .line 418
    :cond_c
    iget-object v2, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {v2, p1}, Landroid/webkit/WebView;->restoreState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    move-result-object p1

    :goto_6
    if-nez p1, :cond_d

    .line 420
    invoke-direct {p0, v0}, Ll/֨ۚ᩷;->֫(Landroid/net/Uri;)V

    .line 421
    iget-object p1, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void

    .line 423
    :cond_d
    invoke-virtual {p1}, Landroid/webkit/WebBackForwardList;->getCurrentItem()Landroid/webkit/WebHistoryItem;

    move-result-object p1

    if-nez p1, :cond_e

    move-object p1, v1

    goto :goto_7

    .line 424
    :cond_e
    invoke-virtual {p1}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    move-result-object p1

    :goto_7
    if-nez p1, :cond_f

    goto :goto_8

    .line 425
    :cond_f
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    :goto_8
    invoke-direct {p0, v1}, Ll/֨ۚ᩷;->֫(Landroid/net/Uri;)V

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 1189
    invoke-virtual {p0}, Ll/֨ܿ;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f000f

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const v0, 0x7f0a0394

    .line 1190
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iput-object v0, p0, Ll/֨ۚ᩷;->ܿۧ:Landroid/view/MenuItem;

    const v0, 0x7f0a0395

    .line 1191
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iput-object p1, p0, Ll/֨ۚ᩷;->ܳۧ:Landroid/view/MenuItem;

    .line 1192
    invoke-direct {p0}, Ll/֨ۚ᩷;->֫֫()V

    const/4 p1, 0x1

    return p1
.end method

.method public final onDestroy()V
    .locals 4

    .line 1558
    iget-object v0, p0, Ll/֨ۚ᩷;->ۜۧ:Ll/᩶ۚ᩷;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 1559
    invoke-virtual {v0, v1}, Ll/᩶ۚ᩷;->֫(Z)V

    .line 1561
    :cond_0
    iget-object v0, p0, Ll/֨ۚ᩷;->ۢۧ:Ll/ܳܿܳ;

    if-eqz v0, :cond_1

    .line 1562
    invoke-virtual {v0}, Ll/ܳܿܳ;->֫()V

    .line 1564
    :cond_1
    iget-object v0, p0, Ll/֨ۚ᩷;->ۘۧ:Ll/ᩴۚ᩷;

    if-eqz v0, :cond_2

    .line 1565
    invoke-static {v0}, Ll/ᩴۚ᩷;->ۧ(Ll/ᩴۚ᩷;)V

    .line 1566
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-eqz v0, :cond_2

    const-string v1, "__mtMarkdownState"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 1568
    :cond_2
    iget-object v0, p0, Ll/֨ۚ᩷;->ᩴۧ:Ll/᩸ۖ;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 1569
    invoke-virtual {v0}, Ll/᩸ۖ;->֫()V

    .line 1570
    iput-object v1, p0, Ll/֨ۚ᩷;->ᩴۧ:Ll/᩸ۖ;

    .line 1572
    :cond_3
    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    if-nez v0, :cond_4

    move-object v0, v1

    goto :goto_0

    :cond_4
    invoke-static {v0}, Ll/ۚۚ᩷;->ܽ(Ll/ۚۚ᩷;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ll/ۙᩳܳ;->ܽ(Ljava/lang/String;)V

    .line 1573
    invoke-direct {p0}, Ll/֨ۚ᩷;->۟()V

    .line 1574
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-eqz v0, :cond_5

    .line 1575
    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 1577
    :cond_5
    iget-object v0, p0, Ll/֨ۚ᩷;->᩹ۧ:Ll/ۖܿܳ;

    if-eqz v0, :cond_6

    .line 1578
    invoke-virtual {v0}, Ll/ۖܿܳ;->close()V

    .line 1579
    iput-object v1, p0, Ll/֨ۚ᩷;->᩹ۧ:Ll/ۖܿܳ;

    .line 1581
    :cond_6
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-eqz v0, :cond_8

    .line 1582
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 1583
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    new-instance v2, Landroid/webkit/WebViewClient;

    invoke-direct {v2}, Landroid/webkit/WebViewClient;-><init>()V

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 1584
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->clearHistory()V

    .line 1585
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_7

    .line 1587
    iget-object v2, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1589
    :cond_7
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 1590
    iput-object v1, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    .line 1592
    :cond_8
    invoke-virtual {p0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    if-eqz v0, :cond_9

    .line 1593
    sget-object v2, Ll/֨ۚ᩷;->ۧܽ:Ll/ۧۤᩴ;

    iget-object v3, p0, Ll/֨ۚ᩷;->ۙۧ:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1594
    iget-object v0, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-virtual {v0}, Ll/ۚۚ᩷;->close()V

    .line 1595
    iput-object v1, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    .line 1597
    :cond_9
    invoke-super {p0}, Ll/ۗܺ᩷;->onDestroy()V

    return-void
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 7

    .line 1201
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-nez v0, :cond_0

    .line 1202
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 1204
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f0a0394

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    .line 1206
    iget-object p1, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 1207
    iget-object p1, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V

    return v2

    :cond_1
    const v1, 0x7f0a0395

    if-ne v0, v1, :cond_2

    .line 1211
    iget-object p1, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoForward()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 1212
    iget-object p1, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->goForward()V

    return v2

    :cond_2
    const v1, 0x7f0a0396

    if-ne v0, v1, :cond_6

    .line 1216
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 1229
    invoke-static {p1}, Ll/᩶ۖ;->֫(Landroid/view/View;)Ll/᩸ۖ;

    move-result-object v0

    .line 1230
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v1

    const v3, 0x7f1205f5

    const/4 v4, 0x0

    .line 1231
    invoke-interface {v1, v4, v2, v4, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v3

    const v5, 0x7f08022b

    .line 1232
    invoke-interface {v3, v5}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v3

    iput-object v3, p0, Ll/֨ۚ᩷;->᩸ۧ:Landroid/view/MenuItem;

    const v3, 0x7f1209df

    const/4 v5, 0x2

    .line 1233
    invoke-interface {v1, v4, v5, v2, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v3

    const v6, 0x7f0801dd

    .line 1234
    invoke-interface {v3, v6}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v3

    iput-object v3, p0, Ll/֨ۚ᩷;->ۗۧ:Landroid/view/MenuItem;

    const/4 v3, 0x5

    const v6, 0x7f120458

    .line 1235
    invoke-interface {v1, v4, v3, v5, v6}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v3

    const v5, 0x7f0801ff

    .line 1236
    invoke-interface {v3, v5}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 1237
    iget-object v3, p0, Ll/֨ۚ᩷;->᩶ۧ:Ll/ۚۚ᩷;

    invoke-static {v3}, Ll/ۚۚ᩷;->ۜ(Ll/ۚۚ᩷;)I

    move-result v3

    if-gez v3, :cond_3

    const v3, 0x7f1204b0

    const/4 v5, 0x3

    .line 1238
    invoke-interface {v1, v4, v5, v5, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v3

    const v5, 0x7f0801e0

    .line 1239
    invoke-interface {v3, v5}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v3

    iput-object v3, p0, Ll/֨ۚ᩷;->᩷ۧ:Landroid/view/MenuItem;

    :cond_3
    const v3, 0x7f120316

    const/4 v5, 0x4

    .line 1241
    invoke-interface {v1, v4, v5, v5, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    const v3, 0x7f0801f5

    .line 1242
    invoke-interface {v1, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 1243
    invoke-virtual {v0}, Ll/᩸ۖ;->ᩳ()V

    .line 1244
    new-instance v1, Ll/ۗܽܽ;

    const/4 v3, 0x4

    invoke-direct {v1, v3, p0}, Ll/ۗܽܽ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 1245
    new-instance v1, Ll/ۘ᩵᩷;

    invoke-direct {v1, p0}, Ll/ۘ᩵᩷;-><init>(Ll/ۗܺ᩷;)V

    invoke-virtual {v0, v1}, Ll/᩸ۖ;->֫(Ll/۠ۖ;)V

    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 46
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    .line 47
    instance-of v3, p1, Ll/ۡۢ;

    if-eqz v3, :cond_4

    check-cast p1, Ll/ۡۢ;

    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 49
    invoke-virtual {p1}, Ll/ۡۢ;->ܳ()I

    move-result p1

    if-eqz p1, :cond_4

    .line 51
    new-instance v3, Ll/۫᩻;

    invoke-direct {v3, v1, p1}, Ll/۫᩻;-><init>(Landroid/content/Context;I)V

    move-object v1, v3

    .line 39
    :cond_4
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v1, 0x0

    const v3, 0x7f0d012c

    .line 40
    invoke-virtual {p1, v3, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const v1, 0x7f0a0273

    .line 1259
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    iput-object v1, p0, Ll/֨ۚ᩷;->ۤۧ:Landroid/widget/FrameLayout;

    const v1, 0x7f0a0274

    .line 1260
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/֨ۚ᩷;->ۨۧ:Landroid/widget/TextView;

    const v1, 0x7f0a0272

    .line 1261
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    iput-object v1, p0, Ll/֨ۚ᩷;->۫ۧ:Landroid/widget/FrameLayout;

    .line 1262
    iget-object v1, p0, Ll/֨ۚ᩷;->ۤۧ:Landroid/widget/FrameLayout;

    new-instance v3, Ll/᩶ܶ᩷;

    const/4 v4, 0x4

    invoke-direct {v3, v4, p0}, Ll/᩶ܶ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1263
    iget-object v1, p0, Ll/֨ۚ᩷;->۫ۧ:Landroid/widget/FrameLayout;

    new-instance v3, Ll/ᩴܺ᩷;

    const/4 v4, 0x2

    invoke-direct {v3, p0, v4}, Ll/ᩴܺ᩷;-><init>(Landroid/view/KeyEvent$Callback;I)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1265
    iput-object v0, p0, Ll/֨ۚ᩷;->ᩴۧ:Ll/᩸ۖ;

    .line 1266
    invoke-direct {p0}, Ll/֨ۚ᩷;->֫֫()V

    .line 1267
    iget v1, p0, Ll/֨ۚ᩷;->ۛۧ:I

    .line 1410
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "%"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1267
    invoke-static {v0, v1, p1}, Ll/᩶ۖ;->֫(Ll/᩸ۖ;Ljava/lang/String;Landroid/view/View;)V

    :cond_5
    return v2

    .line 1222
    :cond_6
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final onPause()V
    .locals 2

    .line 1505
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 1506
    invoke-virtual {v0}, Landroid/webkit/WebView;->onPause()V

    .line 1508
    :cond_0
    iget-object v0, p0, Ll/֨ۚ᩷;->ۜۧ:Ll/᩶ۚ᩷;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 1509
    invoke-virtual {v0, v1}, Ll/᩶ۚ᩷;->֫(Z)V

    .line 1511
    :cond_1
    invoke-super {p0}, Ll/ۗܺ᩷;->onPause()V

    return-void
.end method

.method public final onResume()V
    .locals 2

    .line 1519
    invoke-super {p0}, Ll/ۗܺ᩷;->onResume()V

    .line 1520
    iget-object v0, p0, Ll/֨ۚ᩷;->ۜۧ:Ll/᩶ۚ᩷;

    if-eqz v0, :cond_0

    .line 1521
    iget-boolean v1, p0, Ll/֨ۚ᩷;->᩻ۧ:Z

    invoke-virtual {v0, v1}, Ll/᩶ۚ᩷;->֫(Z)V

    .line 1523
    :cond_0
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-eqz v0, :cond_1

    .line 1524
    invoke-virtual {v0}, Landroid/webkit/WebView;->onResume()V

    .line 1525
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/֨ۚ᩷;->ܽ(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .line 1532
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 1533
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1534
    iget-object v1, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->saveState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    const-string v1, "web_view"

    .line 1535
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1536
    iget-object v0, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/֨ۚ᩷;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1537
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1539
    iget-object v1, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getScale()F

    move-result v1

    const v2, 0x3c23d70a    # 0.01f

    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 1540
    iget-object v2, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v1

    const-string v3, "x"

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 1541
    iget-object v2, p0, Ll/֨ۚ᩷;->۬ۧ:Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/view/View;->getScrollY()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v1

    const-string v1, "y"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v1, "markdown_scroll"

    .line 1542
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1545
    :cond_0
    iget-object v0, p0, Ll/֨ۚ᩷;->᩵ۧ:Ll/᩵ۚ᩷;

    const-string v1, "preview_resources_allowed"

    .line 1546
    iget-boolean v2, v0, Ll/᩵ۚ᩷;->֫:Z

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "source_label"

    .line 1547
    iget-object v0, v0, Ll/᩵ۚ᩷;->ۧ:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "zoom_percent"

    .line 1548
    iget v1, p0, Ll/֨ۚ᩷;->ۛۧ:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "fullscreen"

    .line 1549
    iget-boolean v1, p0, Ll/֨ۚ᩷;->᩻ۧ:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1550
    invoke-super {p0, p1}, Ll/᩻ܽ;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    .line 1167
    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    .line 1169
    iget-boolean p1, p0, Ll/֨ۚ᩷;->᩻ۧ:Z

    if-eqz p1, :cond_0

    .line 1170
    invoke-direct {p0}, Ll/֨ۚ᩷;->ۨ()V

    :cond_0
    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "HtmlPreviewActivity"

    return-object v0
.end method
