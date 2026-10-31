.class public final Ll/᩺᩶ۚ;
.super Ljava/lang/Object;
.source "P4QI"


# instance fields
.field public final ֫:[B

.field public final ۧ:I


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Ll/᩺᩶ۚ;->֫:[B

    .line 74
    iput p2, p0, Ll/᩺᩶ۚ;->ۧ:I

    return-void
.end method

.method public static ֫(Ll/᩺᩶ۚ;Ll/ᩳ᩶ۚ;)V
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    .line 195
    invoke-virtual {p1, p0}, Ll/ᩳ᩶ۚ;->֫(I)V

    return-void

    .line 197
    :cond_0
    iget-object v0, p0, Ll/᩺᩶ۚ;->֫:[B

    iget p0, p0, Ll/᩺᩶ۚ;->ۧ:I

    aget-byte v1, v0, p0

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    .line 198
    invoke-virtual {p1, p0, v1, v0}, Ll/ᩳ᩶ۚ;->֫(II[B)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 9

    .line 84
    iget-object v0, p0, Ll/᩺᩶ۚ;->֫:[B

    iget v1, p0, Ll/᩺᩶ۚ;->ۧ:I

    aget-byte v2, v0, v1

    .line 164
    new-instance v3, Ljava/lang/StringBuilder;

    mul-int/lit8 v4, v2, 0x2

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_4

    mul-int/lit8 v5, v4, 0x2

    add-int v6, v5, v1

    const/4 v7, 0x1

    add-int/2addr v6, v7

    .line 96
    aget-byte v6, v0, v6

    if-eqz v6, :cond_3

    if-eq v6, v7, :cond_2

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1

    const/4 v8, 0x3

    if-ne v6, v8, :cond_0

    add-int/2addr v5, v1

    add-int/2addr v5, v7

    .line 108
    aget-byte v5, v0, v5

    .line 177
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v5, 0x3b

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 180
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_1
    const/16 v5, 0x2a

    .line 174
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const/16 v5, 0x2e

    .line 171
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    const/16 v5, 0x5b

    .line 168
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 183
    :cond_4
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
