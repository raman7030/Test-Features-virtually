.class public Ll/֨᩺ۚ;
.super Ll/ۜۗۚ;
.source "S7CV"


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    .line 39
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, ""

    invoke-direct {p0, v0, v1}, Ll/ۜۗۚ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
