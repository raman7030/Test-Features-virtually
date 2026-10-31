.class public final Ll/ۗ۟ۖ;
.super Ljava/lang/Object;
.source "G9IQ"


# static fields
.field public static final ֫:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 37
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۗ۟ۖ;->֫:Ljava/util/HashMap;

    .line 40
    new-instance v1, Ll/᩸۟ۖ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "AES/CCM/NoPadding"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    new-instance v1, Ll/᩶۟ۖ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "AES/GCM/NoPadding"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۘ۟ۖ;
    .locals 2

    .line 75
    sget-object v0, Ll/ۗ۟ۖ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ܰۖ;

    if-eqz v0, :cond_0

    .line 79
    invoke-interface {v0}, Ll/᩶ܰۖ;->create()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۘ۟ۖ;

    return-object p0

    .line 77
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown AEADCipher "

    .line 0
    invoke-static {v1, p0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 77
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
