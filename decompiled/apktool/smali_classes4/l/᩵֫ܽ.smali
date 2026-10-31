.class public final Ll/᩵֫ܽ;
.super Ljava/lang/Object;
.source "B6YZ"


# instance fields
.field public final ֫:Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;


# direct methods
.method public constructor <init>(Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Ll/᩵֫ܽ;->֫:Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/webkit/WebSettings;)Ll/ܿ֫ܽ;
    .locals 2

    .line 60
    new-instance v0, Ll/ܿ֫ܽ;

    iget-object v1, p0, Ll/᩵֫ܽ;->֫:Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 61
    invoke-interface {v1, p1}, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;->convertSettings(Landroid/webkit/WebSettings;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p1

    .line 60
    const-class v1, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    invoke-static {v1, p1}, Ll/ܺᩴ֡;->֫(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    invoke-direct {v0, p1}, Ll/ܿ֫ܽ;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
