.class public abstract Ll/᩷᩺ܺ;
.super Ljava/lang/Object;
.source "D3VQ"


# direct methods
.method public static ֫(Ljava/lang/CharSequence;)Ll/᩷᩺ܺ;
    .locals 1

    .line 500
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 501
    new-instance v0, Ll/ۜ᩺ܺ;

    check-cast p0, Ljava/lang/String;

    .line 652
    invoke-direct {v0, p0}, Ll/᩻᩺ܺ;-><init>(Ljava/lang/CharSequence;)V

    return-object v0

    .line 502
    :cond_0
    new-instance v0, Ll/᩻᩺ܺ;

    invoke-direct {v0, p0}, Ll/᩻᩺ܺ;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method


# virtual methods
.method public abstract ֫()Ljava/lang/String;
.end method

.method public abstract ۧ()Ll/ܳ۬ܺ;
.end method
