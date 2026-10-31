.class public abstract Ll/۟᩷۠;
.super Ljava/lang/Object;
.source "O44L"


# instance fields
.field public final synthetic ֫:Ll/ܳۢ۠;

.field public ۧ:I


# direct methods
.method public constructor <init>(Ll/ܳۢ۠;I)V
    .locals 0

    .line 201
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟᩷۠;->֫:Ll/ܳۢ۠;

    .line 202
    iput p2, p0, Ll/۟᩷۠;->ۧ:I

    return-void
.end method


# virtual methods
.method public ֫(I)Ll/۟᩷۠;
    .locals 5

    .line 249
    iget v0, p0, Ll/۟᩷۠;->ۧ:I

    if-ne v0, p1, :cond_0

    return-object p0

    .line 252
    :cond_0
    invoke-virtual {p0}, Ll/۟᩷۠;->ᩳ()Ll/۟᩷۠;

    .line 253
    invoke-static {v0}, Ll/֨᩷۠;->ᩴ(I)I

    move-result v0

    .line 254
    invoke-static {p1}, Ll/֨᩷۠;->ᩴ(I)I

    move-result v1

    .line 255
    iget-object v2, p0, Ll/۟᩷۠;->֫:Ll/ܳۢ۠;

    if-eq v0, v1, :cond_2

    if-le v1, v0, :cond_1

    add-int/lit8 v3, v1, -0x1

    goto :goto_0

    :cond_1
    move v3, v1

    .line 258
    :goto_0
    iget-object v4, v2, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    mul-int/lit8 v0, v0, 0x3

    add-int/lit16 v0, v0, 0x85

    add-int/2addr v0, v3

    invoke-virtual {v4, v0}, Ll/֨᩷۠;->ܽ(I)V

    :cond_2
    if-eq p1, v1, :cond_3

    .line 261
    iget-object v0, v2, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    add-int/lit16 v1, p1, 0x8c

    invoke-virtual {v0, v1}, Ll/֨᩷۠;->ܽ(I)V

    .line 263
    :cond_3
    invoke-static {v2}, Ll/ܳۢ۠;->֫(Ll/ܳۢ۠;)[Ll/۟᩷۠;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method public ֫()V
    .locals 0

    return-void
.end method

.method public ۧ()V
    .locals 0

    return-void
.end method

.method public ۧ(I)V
    .locals 1

    .line 235
    iget-object v0, p0, Ll/۟᩷۠;->֫:Ll/ܳۢ۠;

    invoke-static {v0}, Ll/ܳۢ۠;->֫(Ll/ܳۢ۠;)[Ll/۟᩷۠;

    move-result-object v0

    aget-object p1, v0, p1

    invoke-virtual {p1}, Ll/۟᩷۠;->ۧ()V

    return-void
.end method

.method public ܳ()V
    .locals 3

    .line 214
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "store unsupported: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public ܽ()Ll/۟᩷۠;
    .locals 1

    .line 220
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public ܿ()Ll/ۛ᩷۠;
    .locals 2

    .line 241
    invoke-virtual {p0}, Ll/۟᩷۠;->ᩳ()Ll/۟᩷۠;

    .line 242
    iget-object v0, p0, Ll/۟᩷۠;->֫:Ll/ܳۢ۠;

    const/16 v1, 0x9a

    invoke-virtual {v0, v1}, Ll/ܳۢ۠;->֫(I)Ll/ۛ᩷۠;

    move-result-object v0

    return-object v0
.end method

.method public ᩳ()Ll/۟᩷۠;
    .locals 1

    .line 208
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public ᩻()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
