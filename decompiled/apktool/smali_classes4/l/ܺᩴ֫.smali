.class public final Ll/ܺᩴ֫;
.super Ljava/lang/Object;
.source "U8MS"


# static fields
.field public static final ᩳ:Ll/ܺᩴ֫;


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 55
    new-instance v0, Ll/ۡᩴ֫;

    .line 71
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    .line 125
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    .line 126
    new-instance v1, Ll/ܺᩴ֫;

    invoke-direct {v1, v0}, Ll/ܺᩴ֫;-><init>(Ll/ۡᩴ֫;)V

    .line 55
    sput-object v1, Ll/ܺᩴ֫;->ᩳ:Ll/ܺᩴ֫;

    const/4 v0, 0x0

    .line 195
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x1

    .line 196
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x2

    .line 197
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x3

    .line 198
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>(Ll/ۡᩴ֫;)V
    .locals 1

    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 164
    iput v0, p0, Ll/ܺᩴ֫;->ܽ:I

    .line 165
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput v0, p0, Ll/ܺᩴ֫;->ۧ:I

    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    iput p1, p0, Ll/ܺᩴ֫;->֫:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 175
    :cond_0
    instance-of v1, p1, Ll/ܺᩴ֫;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 178
    :cond_1
    check-cast p1, Ll/ܺᩴ֫;

    .line 179
    iget v1, p0, Ll/ܺᩴ֫;->ܽ:I

    iget v3, p1, Ll/ܺᩴ֫;->ܽ:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll/ܺᩴ֫;->ۧ:I

    iget v3, p1, Ll/ܺᩴ֫;->ۧ:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll/ܺᩴ֫;->֫:I

    iget p1, p1, Ll/ܺᩴ֫;->֫:I

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 188
    iget v0, p0, Ll/ܺᩴ֫;->ܽ:I

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 189
    iget v1, p0, Ll/ܺᩴ֫;->ۧ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 190
    iget v1, p0, Ll/ܺᩴ֫;->֫:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method
