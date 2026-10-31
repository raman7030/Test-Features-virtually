.class public final Ll/ۧۙۡ;
.super Ll/ܽۙۡ;
.source "A3Q2"


# static fields
.field public static final ۧ:Ll/ܽۙۡ;


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 65
    new-instance v0, Ll/ۧۙۡ;

    const-string v1, ""

    invoke-direct {v0, v1}, Ll/ۧۙۡ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ۧۙۡ;->ۧ:Ll/ܽۙۡ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Ll/ۧۙۡ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_1

    .line 75
    const-class v0, Ll/ۧۙۡ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 76
    check-cast p1, Ll/ۧۙۡ;

    .line 77
    iget-object v0, p0, Ll/ۧۙۡ;->֫:Ljava/lang/String;

    iget-object p1, p1, Ll/ۧۙۡ;->֫:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 75
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final hashCode()I
    .locals 1

    .line 82
    iget-object v0, p0, Ll/ۧۙۡ;->֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ۧۙۡ;->֫:Ljava/lang/String;

    return-object v0
.end method
