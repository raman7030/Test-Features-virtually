.class public abstract Ll/᩵᩵۠;
.super Ll/ۚۚ۠;
.source "H44W"

# interfaces
.implements Ll/᩻ۡ֨;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 712
    invoke-direct {p0}, Ll/ۚۚ۠;-><init>()V

    return-void
.end method


# virtual methods
.method public final ܳ֫()Z
    .locals 1

    .line 715
    invoke-virtual {p0}, Ll/᩵᩵۠;->ܿ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ll/۫᩵۠;

    invoke-static {v0}, Ll/۟ۚ۠;->֡(Ll/ۚۚ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract ܿ֫()Z
.end method

.method public abstract ᩻֫()Z
.end method
