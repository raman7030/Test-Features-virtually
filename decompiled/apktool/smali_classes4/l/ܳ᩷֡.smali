.class public final Ll/ܳ᩷֡;
.super Ljava/lang/Object;
.source "TATF"


# static fields
.field public static final ܽ:[Ll/ܳ᩷֡;


# instance fields
.field public ֫:I

.field public ۧ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3e9

    new-array v0, v0, [Ll/ܳ᩷֡;

    .line 14
    sput-object v0, Ll/ܳ᩷֡;->ܽ:[Ll/ܳ᩷֡;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ܳ᩷֡;->֫:I

    iput p2, p0, Ll/ܳ᩷֡;->ۧ:I

    return-void
.end method

.method public static ֫(II)Ll/ܳ᩷֡;
    .locals 1

    if-ne p0, p1, :cond_2

    if-ltz p0, :cond_2

    const/16 v0, 0x3e8

    if-le p0, v0, :cond_0

    goto :goto_0

    .line 32
    :cond_0
    sget-object p1, Ll/ܳ᩷֡;->ܽ:[Ll/ܳ᩷֡;

    aget-object v0, p1, p0

    if-nez v0, :cond_1

    .line 33
    new-instance v0, Ll/ܳ᩷֡;

    invoke-direct {v0, p0, p0}, Ll/ܳ᩷֡;-><init>(II)V

    aput-object v0, p1, p0

    .line 35
    :cond_1
    aget-object p0, p1, p0

    return-object p0

    .line 30
    :cond_2
    :goto_0
    new-instance v0, Ll/ܳ᩷֡;

    invoke-direct {v0, p0, p1}, Ll/ܳ᩷֡;-><init>(II)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 48
    instance-of v1, p1, Ll/ܳ᩷֡;

    if-nez v1, :cond_0

    goto :goto_0

    .line 51
    :cond_0
    check-cast p1, Ll/ܳ᩷֡;

    .line 52
    iget v1, p0, Ll/ܳ᩷֡;->֫:I

    iget v2, p1, Ll/ܳ᩷֡;->֫:I

    if-ne v1, v2, :cond_1

    iget v1, p0, Ll/ܳ᩷֡;->ۧ:I

    iget p1, p1, Ll/ܳ᩷֡;->ۧ:I

    if-ne v1, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 58
    iget v0, p0, Ll/ܳ᩷֡;->֫:I

    add-int/lit16 v0, v0, 0x2c9

    mul-int/lit8 v0, v0, 0x1f

    .line 59
    iget v1, p0, Ll/ܳ᩷֡;->ۧ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll/ܳ᩷֡;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܳ᩷֡;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
