.class public final Ll/ۜ֡֫;
.super Ljava/lang/Object;
.source "G8OG"


# static fields
.field public static final ᩳ:Ll/ۜ֡֫;


# instance fields
.field public final ֫:I

.field public final ۧ:F

.field public final ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 32
    new-instance v0, Ll/ۜ֡֫;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Ll/ۜ֡֫;-><init>(II)V

    sput-object v0, Ll/ۜ֡֫;->ᩳ:Ll/ۜ֡֫;

    .line 127
    invoke-static {v1}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x1

    .line 128
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x3

    .line 130
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    .line 66
    invoke-direct {p0, p1, p2, v0}, Ll/ۜ֡֫;-><init>(IIF)V

    return-void
.end method

.method public constructor <init>(IIF)V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput p1, p0, Ll/ۜ֡֫;->ܽ:I

    .line 85
    iput p2, p0, Ll/ۜ֡֫;->֫:I

    .line 87
    iput p3, p0, Ll/ۜ֡֫;->ۧ:F

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 109
    :cond_0
    instance-of v1, p1, Ll/ۜ֡֫;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 110
    check-cast p1, Ll/ۜ֡֫;

    .line 111
    iget v1, p0, Ll/ۜ֡֫;->ܽ:I

    iget v3, p1, Ll/ۜ֡֫;->ܽ:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Ll/ۜ֡֫;->֫:I

    iget v3, p1, Ll/ۜ֡֫;->֫:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Ll/ۜ֡֫;->ۧ:F

    iget p1, p1, Ll/ۜ֡֫;->ۧ:F

    cmpl-float p1, v1, p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 121
    iget v0, p0, Ll/ۜ֡֫;->ܽ:I

    add-int/lit16 v0, v0, 0xd9

    mul-int/lit8 v0, v0, 0x1f

    .line 122
    iget v1, p0, Ll/ۜ֡֫;->֫:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 123
    iget v1, p0, Ll/ۜ֡֫;->ۧ:F

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
