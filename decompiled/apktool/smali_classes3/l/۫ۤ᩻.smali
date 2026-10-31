.class public final Ll/۫ۤ᩻;
.super Ljava/lang/Object;
.source "C7AH"


# static fields
.field public static final ۧ:Ll/۫ۤ᩻;


# instance fields
.field public final ֫:Ll/۠ܳܳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 436
    new-instance v0, Ll/۫ۤ᩻;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/۫ۤ᩻;-><init>(Ll/۠ܳܳ;)V

    sput-object v0, Ll/۫ۤ᩻;->ۧ:Ll/۫ۤ᩻;

    return-void
.end method

.method public constructor <init>(Ll/۠ܳܳ;)V
    .locals 0

    .line 442
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 443
    iput-object p1, p0, Ll/۫ۤ᩻;->֫:Ll/۠ܳܳ;

    return-void
.end method

.method public static ֫(Ll/۫ۤ᩻;)Ll/۠ܳܳ;
    .locals 0

    .line 471
    iget-object p0, p0, Ll/۫ۤ᩻;->֫:Ll/۠ܳܳ;

    return-object p0
.end method

.method public static ֫()Ll/۫ۤ᩻;
    .locals 1

    .line 450
    sget-object v0, Ll/۫ۤ᩻;->ۧ:Ll/۫ۤ᩻;

    return-object v0
.end method

.method public static ֫(Ll/۠ܳܳ;)Ll/۫ۤ᩻;
    .locals 1

    .line 457
    new-instance v0, Ll/۫ۤ᩻;

    invoke-direct {v0, p0}, Ll/۫ۤ᩻;-><init>(Ll/۠ܳܳ;)V

    return-object v0
.end method

.method public static ۧ(Ll/۫ۤ᩻;)Z
    .locals 0

    .line 464
    iget-object p0, p0, Ll/۫ۤ᩻;->֫:Ll/۠ܳܳ;

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
