.class public abstract Ll/ۧ۫֡;
.super Ll/۟۬֡;
.source "U4Z6"

# interfaces
.implements Ll/ܿۧۚ;


# instance fields
.field public ᩶:Ll/ܺ۫֡;


# direct methods
.method public constructor <init>(Ll/֨ۗ֡;)V
    .locals 0

    .line 48
    invoke-direct {p0, p1}, Ll/۟۬֡;-><init>(Ll/֨ۗ֡;)V

    return-void
.end method


# virtual methods
.method public final ۛ()Ll/ܺ۫֡;
    .locals 2

    .line 53
    iget-object v0, p0, Ll/ۧ۫֡;->᩶:Ll/ܺ۫֡;

    if-eqz v0, :cond_0

    return-object v0

    .line 54
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The referrer has not been set yet"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
