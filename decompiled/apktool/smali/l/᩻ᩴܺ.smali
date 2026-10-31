.class public final Ll/᩻ᩴܺ;
.super Ljava/io/FilterWriter;
.source "Z4ZE"


# instance fields
.field public final ۗ:Ljava/lang/String;

.field public final ۙ:I

.field public final ۬:I

.field public ᩶:I

.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public constructor <init>(Ljava/io/StringWriter;ILjava/lang/String;)V
    .locals 1

    .line 69
    invoke-direct {p0, p1}, Ljava/io/FilterWriter;-><init>(Ljava/io/Writer;)V

    if-ltz p2, :cond_3

    if-eqz p2, :cond_0

    move p1, p2

    goto :goto_0

    :cond_0
    const p1, 0x7fffffff

    .line 83
    :goto_0
    iput p1, p0, Ll/᩻ᩴܺ;->۬:I

    const/4 p1, 0x1

    shr-int/2addr p2, p1

    .line 84
    iput p2, p0, Ll/᩻ᩴܺ;->ۙ:I

    .line 85
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    const/4 p3, 0x0

    :cond_1
    iput-object p3, p0, Ll/᩻ᩴܺ;->ۗ:Ljava/lang/String;

    const/4 p3, 0x0

    .line 183
    iput p3, p0, Ll/᩻ᩴܺ;->᩹:I

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    .line 184
    :goto_1
    iput-boolean p1, p0, Ll/᩻ᩴܺ;->᩸:Z

    .line 185
    iput p3, p0, Ll/᩻ᩴܺ;->᩶:I

    return-void

    .line 76
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "width < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final write(I)V
    .locals 7

    .line 106
    iget-object v0, p0, Ljava/io/FilterWriter;->lock:Ljava/lang/Object;

    monitor-enter v0

    .line 107
    :try_start_0
    iget-boolean v1, p0, Ll/᩻ᩴܺ;->᩸:Z

    const/16 v2, 0x20

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    if-ne p1, v2, :cond_0

    .line 109
    iget v1, p0, Ll/᩻ᩴܺ;->᩶:I

    add-int/2addr v1, v3

    iput v1, p0, Ll/᩻ᩴܺ;->᩶:I

    .line 110
    iget v5, p0, Ll/᩻ᩴܺ;->ۙ:I

    if-lt v1, v5, :cond_1

    .line 111
    iput v5, p0, Ll/᩻ᩴܺ;->᩶:I

    .line 112
    iput-boolean v4, p0, Ll/᩻ᩴܺ;->᩸:Z

    goto :goto_0

    .line 115
    :cond_0
    iput-boolean v4, p0, Ll/᩻ᩴܺ;->᩸:Z

    .line 119
    :cond_1
    :goto_0
    iget v1, p0, Ll/᩻ᩴܺ;->᩹:I

    iget v5, p0, Ll/᩻ᩴܺ;->۬:I

    const/16 v6, 0xa

    if-ne v1, v5, :cond_2

    if-eq p1, v6, :cond_2

    .line 120
    iget-object v1, p0, Ljava/io/FilterWriter;->out:Ljava/io/Writer;

    invoke-virtual {v1, v6}, Ljava/io/Writer;->write(I)V

    .line 121
    iput v4, p0, Ll/᩻ᩴܺ;->᩹:I

    .line 128
    :cond_2
    iget v1, p0, Ll/᩻ᩴܺ;->᩹:I

    if-nez v1, :cond_5

    .line 129
    iget-object v1, p0, Ll/᩻ᩴܺ;->ۗ:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 130
    iget-object v5, p0, Ljava/io/FilterWriter;->out:Ljava/io/Writer;

    invoke-virtual {v5, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 133
    :cond_3
    iget-boolean v1, p0, Ll/᩻ᩴܺ;->᩸:Z

    if-nez v1, :cond_5

    const/4 v1, 0x0

    .line 134
    :goto_1
    iget v5, p0, Ll/᩻ᩴܺ;->᩶:I

    if-ge v1, v5, :cond_4

    .line 135
    iget-object v5, p0, Ljava/io/FilterWriter;->out:Ljava/io/Writer;

    invoke-virtual {v5, v2}, Ljava/io/Writer;->write(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 137
    :cond_4
    iput v5, p0, Ll/᩻ᩴܺ;->᩹:I

    .line 141
    :cond_5
    iget-object v1, p0, Ljava/io/FilterWriter;->out:Ljava/io/Writer;

    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(I)V

    if-ne p1, v6, :cond_7

    .line 183
    iput v4, p0, Ll/᩻ᩴܺ;->᩹:I

    .line 184
    iget p1, p0, Ll/᩻ᩴܺ;->ۙ:I

    if-eqz p1, :cond_6

    goto :goto_2

    :cond_6
    const/4 v3, 0x0

    :goto_2
    iput-boolean v3, p0, Ll/᩻ᩴܺ;->᩸:Z

    .line 185
    iput v4, p0, Ll/᩻ᩴܺ;->᩶:I

    goto :goto_3

    .line 146
    :cond_7
    iget p1, p0, Ll/᩻ᩴܺ;->᩹:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/᩻ᩴܺ;->᩹:I

    .line 148
    :goto_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final write(Ljava/lang/String;II)V
    .locals 2

    .line 170
    iget-object v0, p0, Ljava/io/FilterWriter;->lock:Ljava/lang/Object;

    monitor-enter v0

    :goto_0
    if-lez p3, :cond_0

    .line 172
    :try_start_0
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {p0, v1}, Ll/᩻ᩴܺ;->write(I)V

    add-int/lit8 p2, p2, 0x1

    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    .line 176
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final write([CII)V
    .locals 2

    .line 156
    iget-object v0, p0, Ljava/io/FilterWriter;->lock:Ljava/lang/Object;

    monitor-enter v0

    :goto_0
    if-lez p3, :cond_0

    .line 158
    :try_start_0
    aget-char v1, p1, p2

    invoke-virtual {p0, v1}, Ll/᩻ᩴܺ;->write(I)V

    add-int/lit8 p2, p2, 0x1

    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    .line 162
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
