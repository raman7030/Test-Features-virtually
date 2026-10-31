.class public Ll/ܽ᩻ܳ;
.super Ll/֫᩻ܳ;
.source "X7QW"


# instance fields
.field public ۡ:I

.field public final ܺ:[C


# direct methods
.method public constructor <init>(Ljava/io/Writer;[C)V
    .locals 0

    .line 88
    invoke-direct {p0, p1}, Ll/֫᩻ܳ;-><init>(Ljava/io/Writer;)V

    .line 89
    iput-object p2, p0, Ll/ܽ᩻ܳ;->ܺ:[C

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/Writer;[CLl/ۧ᩻ܳ;)V
    .locals 0

    .line 82
    invoke-direct {p0, p1, p2}, Ll/ܽ᩻ܳ;-><init>(Ljava/io/Writer;[C)V

    return-void
.end method

.method private ۜ()Z
    .locals 3

    .line 143
    iget-object v0, p0, Ll/ܽ᩻ܳ;->ܺ:[C

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 146
    :cond_0
    iget-object v0, p0, Ll/֫᩻ܳ;->֫:Ljava/io/Writer;

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(I)V

    .line 147
    :goto_0
    iget v0, p0, Ll/ܽ᩻ܳ;->ۡ:I

    if-ge v1, v0, :cond_1

    .line 148
    iget-object v0, p0, Ll/֫᩻ܳ;->֫:Ljava/io/Writer;

    iget-object v2, p0, Ll/ܽ᩻ܳ;->ܺ:[C

    invoke-virtual {v0, v2}, Ljava/io/Writer;->write([C)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public ֫()V
    .locals 2

    .line 101
    iget v0, p0, Ll/ܽ᩻ܳ;->ۡ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܽ᩻ܳ;->ۡ:I

    .line 102
    invoke-direct {p0}, Ll/ܽ᩻ܳ;->ۜ()Z

    .line 103
    iget-object v0, p0, Ll/֫᩻ܳ;->֫:Ljava/io/Writer;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    return-void
.end method

.method public ۧ()V
    .locals 2

    .line 94
    iget v0, p0, Ll/ܽ᩻ܳ;->ۡ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܽ᩻ܳ;->ۡ:I

    .line 95
    iget-object v0, p0, Ll/֫᩻ܳ;->֫:Ljava/io/Writer;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 96
    invoke-direct {p0}, Ll/ܽ᩻ܳ;->ۜ()Z

    return-void
.end method

.method public ܳ()V
    .locals 2

    .line 116
    iget v0, p0, Ll/ܽ᩻ܳ;->ۡ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܽ᩻ܳ;->ۡ:I

    .line 117
    iget-object v0, p0, Ll/֫᩻ܳ;->֫:Ljava/io/Writer;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 118
    invoke-direct {p0}, Ll/ܽ᩻ܳ;->ۜ()Z

    return-void
.end method

.method public ܽ()V
    .locals 2

    .line 108
    iget-object v0, p0, Ll/֫᩻ܳ;->֫:Ljava/io/Writer;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 109
    invoke-direct {p0}, Ll/ܽ᩻ܳ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 110
    iget-object v0, p0, Ll/֫᩻ܳ;->֫:Ljava/io/Writer;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    :cond_0
    return-void
.end method

.method public ܿ()V
    .locals 2

    .line 123
    iget v0, p0, Ll/ܽ᩻ܳ;->ۡ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܽ᩻ܳ;->ۡ:I

    .line 124
    invoke-direct {p0}, Ll/ܽ᩻ܳ;->ۜ()Z

    .line 125
    iget-object v0, p0, Ll/֫᩻ܳ;->֫:Ljava/io/Writer;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    return-void
.end method

.method public ᩳ()V
    .locals 2

    .line 130
    iget-object v0, p0, Ll/֫᩻ܳ;->֫:Ljava/io/Writer;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 131
    iget-object v0, p0, Ll/֫᩻ܳ;->֫:Ljava/io/Writer;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    return-void
.end method

.method public ᩻()V
    .locals 2

    .line 136
    iget-object v0, p0, Ll/֫᩻ܳ;->֫:Ljava/io/Writer;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 137
    invoke-direct {p0}, Ll/ܽ᩻ܳ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 138
    iget-object v0, p0, Ll/֫᩻ܳ;->֫:Ljava/io/Writer;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    :cond_0
    return-void
.end method
