.class public abstract Ll/᩶ۤܺ;
.super Ljava/lang/Object;
.source "Y2OD"


# direct methods
.method public static ֫()Ll/᩹ۤܺ;
    .locals 2

    const/16 v0, 0x8

    const-string v1, "expectedKeys"

    .line 84
    invoke-static {v0, v1}, Ll/᩹ۙܺ;->֫(ILjava/lang/String;)V

    .line 85
    new-instance v0, Ll/ۚۤܺ;

    .line 280
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method

.method public static ۧ()Ll/᩹ۤܺ;
    .locals 2

    .line 172
    sget-object v0, Ll/۬ۤܺ;->᩸:Ll/۬ۤܺ;

    .line 902
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    new-instance v1, Ll/֨ۤܺ;

    invoke-direct {v1, v0}, Ll/֨ۤܺ;-><init>(Ljava/util/Comparator;)V

    return-object v1
.end method
