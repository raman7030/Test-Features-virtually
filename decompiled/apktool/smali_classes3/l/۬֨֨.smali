.class public final Ll/۬֨֨;
.super Ljava/lang/Object;
.source "63QR"


# static fields
.field public static final ܽ:Ll/۬֨֨;

.field public static final ܿ:Ll/۬֨֨;

.field public static final ᩳ:Ll/۬֨֨;


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/۫֨֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 63
    new-instance v0, Ll/۬֨֨;

    sget-object v1, Ll/۫֨֨;->᩶:Ll/۫֨֨;

    invoke-direct {v0, v1}, Ll/۬֨֨;-><init>(Ll/۫֨֨;)V

    sput-object v0, Ll/۬֨֨;->ܽ:Ll/۬֨֨;

    .line 64
    new-instance v0, Ll/۬֨֨;

    sget-object v1, Ll/۫֨֨;->ۙ:Ll/۫֨֨;

    invoke-direct {v0, v1}, Ll/۬֨֨;-><init>(Ll/۫֨֨;)V

    sput-object v0, Ll/۬֨֨;->ᩳ:Ll/۬֨֨;

    .line 65
    new-instance v0, Ll/۬֨֨;

    sget-object v1, Ll/۫֨֨;->۬:Ll/۫֨֨;

    invoke-direct {v0, v1}, Ll/۬֨֨;-><init>(Ll/۫֨֨;)V

    sput-object v0, Ll/۬֨֨;->ܿ:Ll/۬֨֨;

    return-void
.end method

.method public constructor <init>(Ll/۫֨֨;)V
    .locals 2

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    sget-object v0, Ll/۫֨֨;->᩶:Ll/۫֨֨;

    const/4 v1, 0x0

    if-eq p1, v0, :cond_1

    sget-object v0, Ll/۫֨֨;->ۙ:Ll/۫֨֨;

    if-eq p1, v0, :cond_1

    sget-object v0, Ll/۫֨֨;->۬:Ll/۫֨֨;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 71
    iput-object p1, p0, Ll/۬֨֨;->ۧ:Ll/۫֨֨;

    .line 72
    iput v1, p0, Ll/۬֨֨;->֫:I

    return-void
.end method

.method public constructor <init>(Ll/۫֨֨;I)V
    .locals 1

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    sget-object v0, Ll/۫֨֨;->ۗ:Ll/۫֨֨;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 77
    iput-object p1, p0, Ll/۬֨֨;->ۧ:Ll/۫֨֨;

    .line 78
    iput p2, p0, Ll/۬֨֨;->֫:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 108
    instance-of v0, p1, Ll/۬֨֨;

    if-eqz v0, :cond_0

    .line 106
    check-cast p1, Ll/۬֨֨;

    iget-object v0, p0, Ll/۬֨֨;->ۧ:Ll/۫֨֨;

    iget-object v1, p1, Ll/۬֨֨;->ۧ:Ll/۫֨֨;

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/۬֨֨;->֫:I

    iget p1, p1, Ll/۬֨֨;->֫:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 113
    iget-object v0, p0, Ll/۬֨֨;->ۧ:Ll/۫֨֨;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x11

    iget v1, p0, Ll/۬֨֨;->֫:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/۬֨֨;->ۧ:Ll/۫֨֨;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    sget-object v2, Ll/۫֨֨;->ۗ:Ll/۫֨֨;

    if-ne v1, v2, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/۬֨֨;->֫:I

    const-string v3, ")"

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    .line 101
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
