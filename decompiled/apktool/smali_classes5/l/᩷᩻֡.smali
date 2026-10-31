.class public final Ll/᩷᩻֡;
.super Ll/۠ۜ֡;
.source "TAS9"


# static fields
.field public static final ܿ:Ll/᩷᩻֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 14
    new-instance v0, Ll/᩷᩻֡;

    const/4 v1, 0x0

    const v2, 0x7fffffff

    .line 17
    invoke-direct {v0, v1, v2}, Ll/۠ۜ֡;-><init>(Ll/ܽۜ֡;I)V

    .line 14
    sput-object v0, Ll/᩷᩻֡;->ܿ:Ll/᩷᩻֡;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "$"

    return-object v0
.end method

.method public final ֫(I)Ll/ܽۜ֡;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(I)I
    .locals 0

    .line 35
    iget p1, p0, Ll/۠ۜ֡;->ᩳ:I

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
