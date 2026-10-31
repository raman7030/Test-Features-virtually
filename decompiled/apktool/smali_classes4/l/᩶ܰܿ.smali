.class public final Ll/᩶ܰܿ;
.super Ljava/lang/Object;
.source "95HF"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final ֫֫:Ll/᩸ܰܿ;

.field public final ۗ:Ll/᩸ܰܿ;

.field public final ۙ:Ll/ۚܰܿ;

.field public final ۛ:Ll/᩸ܰܿ;

.field public final ۟:Ll/᩸ܰܿ;

.field public final ۤ:Ll/᩸ܰܿ;

.field public final ۨ:Ll/᩸ܰܿ;

.field public final ۫:Ll/᩸ܰܿ;

.field public final ۬:Landroid/widget/CompoundButton;

.field public final ܰ:Ll/᩸ܰܿ;

.field public final ᩶:Ll/᩸ܰܿ;

.field public ᩸:Landroid/text/style/BackgroundColorSpan;

.field public final ᩹:Landroid/widget/TextView;

.field public final ᩺:Ll/᩸ܰܿ;


# direct methods
.method public constructor <init>(Ll/ۚܰܿ;)V
    .locals 4

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 165
    new-instance v0, Landroid/text/style/BackgroundColorSpan;

    const v1, 0x60ffffff

    sget v2, Ll/᩹֡᩷;->֫:I

    and-int/2addr v1, v2

    invoke-direct {v0, v1}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    iput-object v0, p0, Ll/᩶ܰܿ;->᩸:Landroid/text/style/BackgroundColorSpan;

    .line 42
    iput-object p1, p0, Ll/᩶ܰܿ;->ۙ:Ll/ۚܰܿ;

    const v0, 0x7f0a029a

    .line 43
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CompoundButton;

    iput-object v0, p0, Ll/᩶ܰܿ;->۬:Landroid/widget/CompoundButton;

    const v1, 0x7f0a025a

    .line 44
    invoke-virtual {p1, v1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/᩶ܰܿ;->᩹:Landroid/widget/TextView;

    .line 45
    new-instance p1, Ll/᩸ܰܿ;

    const v1, 0x7f0a0527

    const/4 v2, 0x1

    invoke-direct {p1, p0, v2, v1}, Ll/᩸ܰܿ;-><init>(Ll/᩶ܰܿ;II)V

    iput-object p1, p0, Ll/᩶ܰܿ;->۫:Ll/᩸ܰܿ;

    .line 46
    new-instance p1, Ll/᩸ܰܿ;

    const v1, 0x7f0a065f

    invoke-direct {p1, p0, v2, v1}, Ll/᩸ܰܿ;-><init>(Ll/᩶ܰܿ;II)V

    iput-object p1, p0, Ll/᩶ܰܿ;->᩺:Ll/᩸ܰܿ;

    .line 47
    new-instance p1, Ll/᩸ܰܿ;

    const v1, 0x7f0a052a

    const/4 v2, 0x2

    invoke-direct {p1, p0, v2, v1}, Ll/᩸ܰܿ;-><init>(Ll/᩶ܰܿ;II)V

    iput-object p1, p0, Ll/᩶ܰܿ;->ۨ:Ll/᩸ܰܿ;

    .line 48
    new-instance p1, Ll/᩸ܰܿ;

    const v1, 0x7f0a0662

    invoke-direct {p1, p0, v2, v1}, Ll/᩸ܰܿ;-><init>(Ll/᩶ܰܿ;II)V

    iput-object p1, p0, Ll/᩶ܰܿ;->֫֫:Ll/᩸ܰܿ;

    .line 49
    new-instance p1, Ll/᩸ܰܿ;

    const v1, 0x7f0a0528

    const/4 v2, 0x4

    invoke-direct {p1, p0, v2, v1}, Ll/᩸ܰܿ;-><init>(Ll/᩶ܰܿ;II)V

    iput-object p1, p0, Ll/᩶ܰܿ;->ۤ:Ll/᩸ܰܿ;

    .line 50
    new-instance p1, Ll/᩸ܰܿ;

    const v1, 0x7f0a0660

    invoke-direct {p1, p0, v2, v1}, Ll/᩸ܰܿ;-><init>(Ll/᩶ܰܿ;II)V

    iput-object p1, p0, Ll/᩶ܰܿ;->ܰ:Ll/᩸ܰܿ;

    .line 51
    new-instance p1, Ll/᩸ܰܿ;

    const v1, 0x7f0a0529

    const/16 v3, 0x8

    invoke-direct {p1, p0, v3, v1}, Ll/᩸ܰܿ;-><init>(Ll/᩶ܰܿ;II)V

    iput-object p1, p0, Ll/᩶ܰܿ;->ۛ:Ll/᩸ܰܿ;

    .line 52
    new-instance p1, Ll/᩸ܰܿ;

    const v1, 0x7f0a0661

    invoke-direct {p1, p0, v3, v1}, Ll/᩸ܰܿ;-><init>(Ll/᩶ܰܿ;II)V

    iput-object p1, p0, Ll/᩶ܰܿ;->۟:Ll/᩸ܰܿ;

    .line 53
    new-instance p1, Ll/᩸ܰܿ;

    const v1, 0x7f0a025c

    invoke-direct {p1, p0, v2, v1}, Ll/᩸ܰܿ;-><init>(Ll/᩶ܰܿ;II)V

    iput-object p1, p0, Ll/᩶ܰܿ;->ۗ:Ll/᩸ܰܿ;

    .line 54
    new-instance p1, Ll/᩸ܰܿ;

    const v1, 0x7f0a025b

    invoke-direct {p1, p0, v3, v1}, Ll/᩸ܰܿ;-><init>(Ll/᩶ܰܿ;II)V

    iput-object p1, p0, Ll/᩶ܰܿ;->᩶:Ll/᩸ܰܿ;

    .line 55
    invoke-virtual {v0, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩶ܰܿ;)Landroid/text/style/BackgroundColorSpan;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ܰܿ;->᩸:Landroid/text/style/BackgroundColorSpan;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/᩶ܰܿ;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ܰܿ;->᩹:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩶ܰܿ;)Ll/ۚܰܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ܰܿ;->ۙ:Ll/ۚܰܿ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩶ܰܿ;)Landroid/widget/CompoundButton;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ܰܿ;->۬:Landroid/widget/CompoundButton;

    return-object p0
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 162
    invoke-virtual {p0}, Ll/᩶ܰܿ;->֫()V

    return-void
.end method

.method public final ֫()V
    .locals 12

    .line 147
    iget-object v0, p0, Ll/᩶ܰܿ;->᩹:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    iget-object v0, p0, Ll/᩶ܰܿ;->۫:Ll/᩸ܰܿ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/᩸ܰܿ;->֫(I)Z

    .line 149
    iget-object v0, p0, Ll/᩶ܰܿ;->᩺:Ll/᩸ܰܿ;

    invoke-virtual {v0, v1}, Ll/᩸ܰܿ;->֫(I)Z

    .line 150
    iget-object v0, p0, Ll/᩶ܰܿ;->ۨ:Ll/᩸ܰܿ;

    invoke-virtual {v0, v1}, Ll/᩸ܰܿ;->֫(I)Z

    .line 151
    iget-object v0, p0, Ll/᩶ܰܿ;->֫֫:Ll/᩸ܰܿ;

    invoke-virtual {v0, v1}, Ll/᩸ܰܿ;->֫(I)Z

    .line 152
    iget-object v0, p0, Ll/᩶ܰܿ;->ۤ:Ll/᩸ܰܿ;

    invoke-virtual {v0, v1}, Ll/᩸ܰܿ;->֫(I)Z

    .line 153
    iget-object v0, p0, Ll/᩶ܰܿ;->ܰ:Ll/᩸ܰܿ;

    invoke-virtual {v0, v1}, Ll/᩸ܰܿ;->֫(I)Z

    .line 154
    iget-object v0, p0, Ll/᩶ܰܿ;->ۛ:Ll/᩸ܰܿ;

    invoke-virtual {v0, v1}, Ll/᩸ܰܿ;->֫(I)Z

    .line 155
    iget-object v0, p0, Ll/᩶ܰܿ;->۟:Ll/᩸ܰܿ;

    invoke-virtual {v0, v1}, Ll/᩸ܰܿ;->֫(I)Z

    .line 156
    iget-object v0, p0, Ll/᩶ܰܿ;->ۗ:Ll/᩸ܰܿ;

    invoke-virtual {v0, v1}, Ll/᩸ܰܿ;->֫(I)Z

    .line 157
    iget-object v0, p0, Ll/᩶ܰܿ;->᩶:Ll/᩸ܰܿ;

    invoke-virtual {v0, v1}, Ll/᩸ܰܿ;->֫(I)Z

    .line 61
    iget-object v0, p0, Ll/᩶ܰܿ;->ۙ:Ll/ۚܰܿ;

    iget-object v2, v0, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 290
    iget-object v0, v2, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v3

    move-object v0, v3

    .line 66
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    :try_start_1
    invoke-virtual {v3}, Ll/ᩳܽܳ;->length()I

    move-result v4

    .line 922
    iget-object v5, v2, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v5}, Ll/ۧܰܿ;->᩷()I

    move-result v5

    .line 68
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    int-to-long v6, v4

    .line 930
    iget-object v4, v2, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v4}, Ll/ۧܰܿ;->ۡ()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 926
    iget-object v2, v2, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v2}, Ll/ۧܰܿ;->ۜ()I

    move-result v2

    int-to-long v8, v2

    const-wide/16 v10, 0x1

    add-long/2addr v8, v10

    .line 71
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    :cond_0
    int-to-long v8, v5

    sub-long/2addr v6, v8

    const-wide/16 v8, 0x0

    .line 76
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    const-wide/16 v8, 0x8

    .line 75
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    long-to-int v2, v6

    .line 77
    new-array v4, v2, [B

    .line 78
    invoke-virtual {v3, v5, v2, v4}, Ll/ᩳܽܳ;->ܿ(II[B)V

    .line 79
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x1

    if-lez v2, :cond_2

    .line 86
    new-instance v3, Ljava/lang/StringBuilder;

    mul-int/lit8 v5, v2, 0x3

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_1

    const-string v6, "%02X "

    .line 88
    aget-byte v7, v4, v5

    and-int/lit16 v7, v7, 0xff

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-array v8, v0, [Ljava/lang/Object;

    aput-object v7, v8, v1

    invoke-static {v6, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    sub-int/2addr v5, v0

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 91
    iget-object v5, p0, Ll/᩶ܰܿ;->᩹:Landroid/widget/TextView;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    :cond_2
    iget-object v3, p0, Ll/᩶ܰܿ;->۫:Ll/᩸ܰܿ;

    invoke-virtual {v3, v2}, Ll/᩸ܰܿ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 95
    iget-object v3, p0, Ll/᩶ܰܿ;->۫:Ll/᩸ܰܿ;

    invoke-virtual {v3, v4}, Ll/᩸ܰܿ;->֫([B)J

    move-result-wide v5

    .line 96
    iget-object v3, p0, Ll/᩶ܰܿ;->۫:Ll/᩸ܰܿ;

    long-to-int v6, v5

    int-to-byte v5, v6

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/᩸ܰܿ;->֫(Ljava/lang/String;)V

    .line 99
    :cond_3
    iget-object v3, p0, Ll/᩶ܰܿ;->᩺:Ll/᩸ܰܿ;

    invoke-virtual {v3, v2}, Ll/᩸ܰܿ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 100
    iget-object v3, p0, Ll/᩶ܰܿ;->᩺:Ll/᩸ܰܿ;

    invoke-virtual {v3, v4}, Ll/᩸ܰܿ;->֫([B)J

    move-result-wide v5

    .line 101
    iget-object v3, p0, Ll/᩶ܰܿ;->᩺:Ll/᩸ܰܿ;

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/᩸ܰܿ;->֫(Ljava/lang/String;)V

    .line 104
    :cond_4
    iget-object v3, p0, Ll/᩶ܰܿ;->ۨ:Ll/᩸ܰܿ;

    invoke-virtual {v3, v2}, Ll/᩸ܰܿ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 105
    iget-object v3, p0, Ll/᩶ܰܿ;->ۨ:Ll/᩸ܰܿ;

    invoke-virtual {v3, v4}, Ll/᩸ܰܿ;->֫([B)J

    move-result-wide v5

    .line 106
    iget-object v3, p0, Ll/᩶ܰܿ;->ۨ:Ll/᩸ܰܿ;

    long-to-int v6, v5

    int-to-short v5, v6

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/᩸ܰܿ;->֫(Ljava/lang/String;)V

    .line 109
    :cond_5
    iget-object v3, p0, Ll/᩶ܰܿ;->֫֫:Ll/᩸ܰܿ;

    invoke-virtual {v3, v2}, Ll/᩸ܰܿ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 110
    iget-object v3, p0, Ll/᩶ܰܿ;->֫֫:Ll/᩸ܰܿ;

    invoke-virtual {v3, v4}, Ll/᩸ܰܿ;->֫([B)J

    move-result-wide v5

    .line 111
    iget-object v3, p0, Ll/᩶ܰܿ;->֫֫:Ll/᩸ܰܿ;

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/᩸ܰܿ;->֫(Ljava/lang/String;)V

    .line 114
    :cond_6
    iget-object v3, p0, Ll/᩶ܰܿ;->ۤ:Ll/᩸ܰܿ;

    invoke-virtual {v3, v2}, Ll/᩸ܰܿ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 115
    iget-object v3, p0, Ll/᩶ܰܿ;->ۤ:Ll/᩸ܰܿ;

    invoke-virtual {v3, v4}, Ll/᩸ܰܿ;->֫([B)J

    move-result-wide v5

    .line 116
    iget-object v3, p0, Ll/᩶ܰܿ;->ۤ:Ll/᩸ܰܿ;

    long-to-int v6, v5

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/᩸ܰܿ;->֫(Ljava/lang/String;)V

    .line 119
    :cond_7
    iget-object v3, p0, Ll/᩶ܰܿ;->ܰ:Ll/᩸ܰܿ;

    invoke-virtual {v3, v2}, Ll/᩸ܰܿ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 120
    iget-object v3, p0, Ll/᩶ܰܿ;->ܰ:Ll/᩸ܰܿ;

    invoke-virtual {v3, v4}, Ll/᩸ܰܿ;->֫([B)J

    move-result-wide v5

    .line 121
    iget-object v3, p0, Ll/᩶ܰܿ;->ܰ:Ll/᩸ܰܿ;

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/᩸ܰܿ;->֫(Ljava/lang/String;)V

    .line 124
    :cond_8
    iget-object v3, p0, Ll/᩶ܰܿ;->ۛ:Ll/᩸ܰܿ;

    invoke-virtual {v3, v2}, Ll/᩸ܰܿ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 125
    iget-object v3, p0, Ll/᩶ܰܿ;->ۛ:Ll/᩸ܰܿ;

    invoke-virtual {v3, v4}, Ll/᩸ܰܿ;->֫([B)J

    move-result-wide v5

    .line 126
    iget-object v3, p0, Ll/᩶ܰܿ;->ۛ:Ll/᩸ܰܿ;

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/᩸ܰܿ;->֫(Ljava/lang/String;)V

    .line 129
    :cond_9
    iget-object v3, p0, Ll/᩶ܰܿ;->۟:Ll/᩸ܰܿ;

    invoke-virtual {v3, v2}, Ll/᩸ܰܿ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 130
    iget-object v3, p0, Ll/᩶ܰܿ;->۟:Ll/᩸ܰܿ;

    .line 206
    iget v5, v3, Ll/᩸ܰܿ;->᩹:I

    new-array v6, v5, [B

    .line 207
    iget-object v7, v3, Ll/᩸ܰܿ;->᩶:Ll/᩶ܰܿ;

    iget-object v7, v7, Ll/᩶ܰܿ;->۬:Landroid/widget/CompoundButton;

    invoke-virtual {v7}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v7

    if-eqz v7, :cond_a

    .line 208
    invoke-static {v4, v1, v6, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_2

    :cond_a
    const/4 v1, 0x1

    :goto_1
    if-gt v1, v5, :cond_b

    add-int/lit8 v7, v1, -0x1

    sub-int v8, v5, v1

    .line 211
    aget-byte v8, v4, v8

    aput-byte v8, v6, v7

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 214
    :cond_b
    :goto_2
    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, v0, v6}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-virtual {v1}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    .line 130
    invoke-virtual {v3, v0}, Ll/᩸ܰܿ;->֫(Ljava/lang/String;)V

    .line 133
    :cond_c
    iget-object v0, p0, Ll/᩶ܰܿ;->ۗ:Ll/᩸ܰܿ;

    invoke-virtual {v0, v2}, Ll/᩸ܰܿ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 134
    iget-object v0, p0, Ll/᩶ܰܿ;->ۗ:Ll/᩸ܰܿ;

    invoke-virtual {v0, v4}, Ll/᩸ܰܿ;->֫([B)J

    move-result-wide v0

    long-to-int v1, v0

    .line 135
    iget-object v0, p0, Ll/᩶ܰܿ;->ۗ:Ll/᩸ܰܿ;

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩸ܰܿ;->֫(Ljava/lang/String;)V

    .line 138
    :cond_d
    iget-object v0, p0, Ll/᩶ܰܿ;->᩶:Ll/᩸ܰܿ;

    invoke-virtual {v0, v2}, Ll/᩸ܰܿ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 139
    iget-object v0, p0, Ll/᩶ܰܿ;->᩶:Ll/᩸ܰܿ;

    invoke-virtual {v0, v4}, Ll/᩸ܰܿ;->֫([B)J

    move-result-wide v0

    .line 140
    iget-object v2, p0, Ll/᩶ܰܿ;->᩶:Ll/᩸ܰܿ;

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/᩸ܰܿ;->֫(Ljava/lang/String;)V

    :cond_e
    return-void

    :catchall_0
    move-exception v1

    .line 79
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v0

    .line 81
    iget-object v1, p0, Ll/᩶ܰܿ;->ۙ:Ll/ۚܰܿ;

    invoke-virtual {v1, v0}, Ll/ۚܰܿ;->֫(Ljava/io/IOException;)V

    return-void
.end method
