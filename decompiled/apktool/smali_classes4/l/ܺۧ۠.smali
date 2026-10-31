.class public final enum Ll/ܺۧ۠;
.super Ll/ۘۧ۠;
.source "A451"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "ABSTRACT_OK"

    const/4 v1, 0x0

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ܺۧ۠;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1899
    invoke-direct {p0, p1, p2, v0}, Ll/ۘۧ۠;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۛ֡֨;Ll/᩹ܽ۠;)Ll/ۘۧ۠;
    .locals 3

    .line 1905
    invoke-virtual {p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide p1

    const-wide/16 v0, 0x4600

    and-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    return-object p0

    .line 1908
    :cond_0
    sget-object p1, Ll/ۘۧ۠;->᩶:Ll/ۘۧ۠;

    return-object p1
.end method
