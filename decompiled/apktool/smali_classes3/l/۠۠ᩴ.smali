.class public final synthetic Ll/۠۠ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/᩺֨ᩴ;


# instance fields
.field public final synthetic a:Ljava/nio/file/CopyOption;


# direct methods
.method public synthetic constructor <init>(Ljava/nio/file/CopyOption;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠۠ᩴ;->a:Ljava/nio/file/CopyOption;

    return-void
.end method

.method public static synthetic a(Ljava/nio/file/CopyOption;)Ll/᩺֨ᩴ;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Ll/ۗܶᩴ;

    if-eqz v0, :cond_1

    check-cast p0, Ll/ۗܶᩴ;

    iget-object p0, p0, Ll/ۗܶᩴ;->a:Ll/᩺֨ᩴ;

    return-object p0

    :cond_1
    instance-of v0, p0, Ll/ܳ۠ᩴ;

    if-eqz v0, :cond_2

    check-cast p0, Ll/ܳ۠ᩴ;

    .line 0
    sget-object p0, Ljava/nio/file/LinkOption;->NOFOLLOW_LINKS:Ljava/nio/file/LinkOption;

    return-object p0

    :cond_2
    instance-of v0, p0, Ll/ۖ۠ᩴ;

    if-eqz v0, :cond_5

    check-cast p0, Ll/ۖ۠ᩴ;

    sget-object v0, Ll/ۖ۠ᩴ;->REPLACE_EXISTING:Ll/ۖ۠ᩴ;

    if-ne p0, v0, :cond_3

    sget-object p0, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    return-object p0

    :cond_3
    sget-object v0, Ll/ۖ۠ᩴ;->COPY_ATTRIBUTES:Ll/ۖ۠ᩴ;

    if-ne p0, v0, :cond_4

    sget-object p0, Ljava/nio/file/StandardCopyOption;->COPY_ATTRIBUTES:Ljava/nio/file/StandardCopyOption;

    return-object p0

    :cond_4
    sget-object p0, Ljava/nio/file/StandardCopyOption;->ATOMIC_MOVE:Ljava/nio/file/StandardCopyOption;

    return-object p0

    :cond_5
    new-instance v0, Ll/۠۠ᩴ;

    invoke-direct {v0, p0}, Ll/۠۠ᩴ;-><init>(Ljava/nio/file/CopyOption;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/۠۠ᩴ;->a:Ljava/nio/file/CopyOption;

    instance-of v1, p1, Ll/۠۠ᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/۠۠ᩴ;

    iget-object p1, p1, Ll/۠۠ᩴ;->a:Ljava/nio/file/CopyOption;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/۠۠ᩴ;->a:Ljava/nio/file/CopyOption;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
