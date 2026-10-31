.class public final Ll/۬ᩳۢ;
.super Ljava/lang/Object;
.source "LAP1"


# instance fields
.field public ֫:I

.field public ۧ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Ll/۬ᩳۢ;->ۧ:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 5

    .line 21
    iget v0, p0, Ll/۬ᩳۢ;->֫:I

    iget-object v1, p0, Ll/۬ᩳۢ;->ۧ:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lt v0, v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 23
    :cond_0
    iget v0, p0, Ll/۬ᩳۢ;->֫:I

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v2, 0x4c

    if-eq v0, v2, :cond_4

    const/16 v2, 0x5b

    if-eq v0, v2, :cond_1

    .line 39
    iget v1, p0, Ll/۬ᩳۢ;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۬ᩳۢ;->֫:I

    .line 40
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 45
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    iget v3, p0, Ll/۬ᩳۢ;->֫:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Ll/۬ᩳۢ;->֫:I

    invoke-interface {v1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    :goto_0
    iget v3, p0, Ll/۬ᩳۢ;->֫:I

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v3, v4, :cond_3

    .line 50
    iget v3, p0, Ll/۬ᩳۢ;->֫:I

    invoke-interface {v1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-ne v3, v2, :cond_2

    .line 52
    iget v4, p0, Ll/۬ᩳۢ;->֫:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Ll/۬ᩳۢ;->֫:I

    .line 53
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 55
    :cond_2
    invoke-virtual {p0}, Ll/۬ᩳۢ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 63
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    iget v2, p0, Ll/۬ᩳۢ;->֫:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/۬ᩳۢ;->֫:I

    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    :cond_5
    iget v2, p0, Ll/۬ᩳۢ;->֫:I

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v2, v3, :cond_6

    .line 68
    iget v2, p0, Ll/۬ᩳۢ;->֫:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/۬ᩳۢ;->֫:I

    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    .line 69
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v3, 0x3b

    if-ne v2, v3, :cond_5

    .line 74
    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
