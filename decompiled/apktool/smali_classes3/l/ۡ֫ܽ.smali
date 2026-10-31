.class public final Ll/ۡ֫ܽ;
.super Ljava/lang/Object;
.source "W73L"


# static fields
.field public static final ֫:Ll/᩵֫ܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 56
    new-instance v0, Ll/᩵֫ܽ;

    .line 43
    sget-object v1, Ll/ܺ֫ܽ;->֫:Ll/ۘ֫ܽ;

    .line 57
    invoke-interface {v1}, Ll/ۘ֫ܽ;->getWebkitToCompatConverter()Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩵֫ܽ;-><init>(Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;)V

    sput-object v0, Ll/ۡ֫ܽ;->֫:Ll/᩵֫ܽ;

    return-void
.end method
