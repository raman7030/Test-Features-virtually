.class public final Ll/ۜ᩷֡;
.super Ll/ۖ᩹ۢ;
.source "YAS6"


# static fields
.field public static final ۧ:Ll/ۜ᩷֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 15
    new-instance v0, Ll/ۜ᩷֡;

    const/4 v1, 0x6

    .line 14
    invoke-direct {v0, v1}, Ll/ۖ᩹ۢ;-><init>(I)V

    .line 15
    sput-object v0, Ll/ۜ᩷֡;->ۧ:Ll/ۜ᩷֡;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 29
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 47
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
