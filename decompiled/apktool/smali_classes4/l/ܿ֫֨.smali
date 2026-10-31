.class public final Ll/ܿ֫֨;
.super Ljava/lang/Object;
.source "Q7EB"


# instance fields
.field public final ֫:Ll/ۧ֫֨;

.field public final ۧ:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    invoke-static {}, Ll/ۧ֫֨;->values()[Ll/ۧ֫֨;

    move-result-object v0

    aget-object p1, v0, p1

    .line 75
    iput-object p1, p0, Ll/ܿ֫֨;->֫:Ll/ۧ֫֨;

    .line 76
    iput p2, p0, Ll/ܿ֫֨;->ۧ:I

    return-void
.end method

.method public constructor <init>(Ll/ۧ֫֨;I)V
    .locals 0

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-object p1, p0, Ll/ܿ֫֨;->֫:Ll/ۧ֫֨;

    .line 81
    iput p2, p0, Ll/ܿ֫֨;->ۧ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܿ֫֨;->֫:Ll/ۧ֫֨;

    invoke-virtual {v1}, Ll/ۧ֫֨;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/ۧ֫֨;->֫(Ll/ۧ֫֨;)I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "{"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/ܿ֫֨;->ۧ:I

    const-string v3, "}"

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    .line 97
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 89
    iget v0, p0, Ll/ܿ֫֨;->ۧ:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 85
    iget-object v0, p0, Ll/ܿ֫֨;->֫:Ll/ۧ֫֨;

    invoke-virtual {v0}, Ll/ۧ֫֨;->ۧ()I

    move-result v0

    return v0
.end method
