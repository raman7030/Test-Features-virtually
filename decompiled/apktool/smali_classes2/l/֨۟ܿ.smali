.class public final synthetic Ll/֨۟ܿ;
.super Ljava/lang/Object;
.source "X4M8"

# interfaces
.implements Ll/ܿۖ᩷;


# instance fields
.field public final synthetic ᩶:Ll/ۜܰܿ;

.field public final synthetic ᩸:Ll/۠۟ܿ;

.field public final synthetic ᩹:Ll/۬۟ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/۠۟ܿ;Ll/۬۟ܿ;Ll/ۜܰܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨۟ܿ;->᩸:Ll/۠۟ܿ;

    iput-object p2, p0, Ll/֨۟ܿ;->᩹:Ll/۬۟ܿ;

    iput-object p3, p0, Ll/֨۟ܿ;->᩶:Ll/ۜܰܿ;

    return-void
.end method


# virtual methods
.method public final ᩻()Z
    .locals 2

    .line 148
    iget-object v0, p0, Ll/֨۟ܿ;->᩸:Ll/۠۟ܿ;

    iget-object v0, v0, Ll/۠۟ܿ;->᩸:Ll/᩸۟ܿ;

    invoke-static {v0}, Ll/᩸۟ܿ;->֫(Ll/᩸۟ܿ;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/֨۟ܿ;->᩹:Ll/۬۟ܿ;

    iget-object v1, p0, Ll/֨۟ܿ;->᩶:Ll/ۜܰܿ;

    invoke-virtual {v0, v1}, Ll/۬۟ܿ;->֫(Ll/ۜܰܿ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
