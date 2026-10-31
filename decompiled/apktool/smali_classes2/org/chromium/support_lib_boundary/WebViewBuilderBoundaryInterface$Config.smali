.class public Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;
.super Ljava/lang/Object;
.source "WebViewBuilderBoundaryInterface.java"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public baseline:I

.field public ᩶:Ljava/util/ArrayList;

.field public ᩸:Ljava/util/ArrayList;

.field public ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 49
    iput v0, p0, Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;->baseline:I

    .line 50
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;->᩹:Ljava/util/ArrayList;

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;->᩸:Ljava/util/ArrayList;

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;->᩶:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 48
    check-cast p1, Ljava/util/function/BiConsumer;

    invoke-virtual {p0, p1}, Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;->accept(Ljava/util/function/BiConsumer;)V

    return-void
.end method

.method public accept(Ljava/util/function/BiConsumer;)V
    .locals 5

    const/4 v0, 0x0

    .line 64
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;->baseline:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p1, v1, v2}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x1

    .line 66
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;->᩹:Ljava/util/ArrayList;

    aput-object v4, v3, v0

    iget-object v0, p0, Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;->᩸:Ljava/util/ArrayList;

    aput-object v0, v3, v1

    const/4 v0, 0x2

    iget-object v1, p0, Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;->᩶:Ljava/util/ArrayList;

    aput-object v1, v3, v0

    .line 65
    invoke-interface {p1, v2, v3}, Ljava/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    .line 55
    iget-object v0, p0, Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    iget-object p1, p0, Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;->᩸:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    iget-object p1, p0, Lorg/chromium/support_lib_boundary/WebViewBuilderBoundaryInterface$Config;->᩶:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
