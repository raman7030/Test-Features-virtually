.class public final Ll/֫֨ۢ;
.super Ljava/lang/Object;
.source "C5F4"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ll/ܽ֨ۢ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ܽ֨ۢ;)V
    .locals 0

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 212
    iput-object p1, p0, Ll/֫֨ۢ;->֫:Ljava/lang/String;

    .line 213
    iput-object p2, p0, Ll/֫֨ۢ;->ۧ:Ll/ܽ֨ۢ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/ܽ֨ۢ;)Ll/֫֨ۢ;
    .locals 1

    .line 226
    new-instance v0, Ll/֫֨ۢ;

    invoke-direct {v0, p0, p1}, Ll/֫֨ۢ;-><init>(Ljava/lang/String;Ll/ܽ֨ۢ;)V

    return-object v0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/ܽ֨ۢ;)Ll/֫֨ۢ;
    .locals 1

    .line 218
    invoke-static {p0}, Ll/ᩳ֨ۢ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 219
    new-instance v0, Ll/֫֨ۢ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ll/֫֨ۢ;-><init>(Ljava/lang/String;Ll/ܽ֨ۢ;)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
