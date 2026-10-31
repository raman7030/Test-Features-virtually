.class public final Ll/ۡۤ֫;
.super Ljava/lang/Object;
.source "68UW"

# interfaces
.implements Ll/ۚ֡֫;


# instance fields
.field public final ֫:[Ll/֡֡֫;

.field public final ۧ:Ll/۬ۤ֫;

.field public final ܽ:Ll/ܶ֡֫;


# direct methods
.method public varargs constructor <init>([Ll/֡֡֫;)V
    .locals 5

    .line 183
    new-instance v0, Ll/۬ۤ֫;

    invoke-direct {v0}, Ll/۬ۤ֫;-><init>()V

    new-instance v1, Ll/ܶ֡֫;

    invoke-direct {v1}, Ll/ܶ֡֫;-><init>()V

    .line 193
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 196
    array-length v2, p1

    add-int/lit8 v2, v2, 0x2

    new-array v2, v2, [Ll/֡֡֫;

    iput-object v2, p0, Ll/ۡۤ֫;->֫:[Ll/֡֡֫;

    const/4 v3, 0x0

    .line 197
    array-length v4, p1

    invoke-static {p1, v3, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 203
    iput-object v0, p0, Ll/ۡۤ֫;->ۧ:Ll/۬ۤ֫;

    .line 204
    iput-object v1, p0, Ll/ۡۤ֫;->ܽ:Ll/ܶ֡֫;

    .line 205
    array-length v3, p1

    aput-object v0, v2, v3

    .line 206
    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    aput-object v1, v2, p1

    return-void
.end method


# virtual methods
.method public final ֫(J)J
    .locals 2

    .line 229
    iget-object v0, p0, Ll/ۡۤ֫;->ܽ:Ll/ܶ֡֫;

    invoke-virtual {v0}, Ll/ܶ֡֫;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 230
    invoke-virtual {v0, p1, p2}, Ll/ܶ֡֫;->֫(J)J

    move-result-wide p1

    :cond_0
    return-wide p1
.end method

.method public final ֫(Ll/ۖ᩵֫;)Ll/ۖ᩵֫;
    .locals 2

    .line 216
    iget v0, p1, Ll/ۖ᩵֫;->ܽ:F

    iget-object v1, p0, Ll/ۡۤ֫;->ܽ:Ll/ܶ֡֫;

    invoke-virtual {v1, v0}, Ll/ܶ֡֫;->ۧ(F)V

    .line 217
    iget v0, p1, Ll/ۖ᩵֫;->֫:F

    invoke-virtual {v1, v0}, Ll/ܶ֡֫;->֫(F)V

    return-object p1
.end method

.method public final ֫(Z)Z
    .locals 1

    .line 223
    iget-object v0, p0, Ll/ۡۤ֫;->ۧ:Ll/۬ۤ֫;

    invoke-virtual {v0, p1}, Ll/۬ۤ֫;->֫(Z)V

    return p1
.end method

.method public final ֫()[Ll/֡֡֫;
    .locals 1

    .line 211
    iget-object v0, p0, Ll/ۡۤ֫;->֫:[Ll/֡֡֫;

    return-object v0
.end method

.method public final ۧ()J
    .locals 2

    .line 236
    iget-object v0, p0, Ll/ۡۤ֫;->ۧ:Ll/۬ۤ֫;

    invoke-virtual {v0}, Ll/۬ۤ֫;->᩷()J

    move-result-wide v0

    return-wide v0
.end method
