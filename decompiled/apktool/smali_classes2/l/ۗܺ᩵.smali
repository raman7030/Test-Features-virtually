.class public final Ll/ۗܺ᩵;
.super Ll/ۛܺ᩵;
.source "9A0K"


# instance fields
.field public ֫:[Ll/᩶ܺ᩵;

.field public ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬ܺ᩵;)V
    .locals 4

    const/4 v0, 0x4

    .line 179
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ۧ(I)V

    .line 180
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    iput v0, p0, Ll/ۗܺ᩵;->ۧ:I

    .line 181
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    if-eqz v0, :cond_3

    .line 184
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 185
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    .line 186
    iget v1, p1, Ll/۬ܺ᩵;->ܽ:I

    mul-int/lit8 v2, v0, 0xc

    .line 187
    invoke-virtual {p1, v2}, Ll/۬ܺ᩵;->֫(I)V

    .line 189
    iget-object v2, p0, Ll/ۗܺ᩵;->֫:[Ll/᩶ܺ᩵;

    if-nez v2, :cond_1

    if-ltz v0, :cond_0

    const v2, 0xffff

    if-gt v0, v2, :cond_0

    .line 192
    new-array v2, v0, [Ll/᩶ܺ᩵;

    iput-object v2, p0, Ll/ۗܺ᩵;->֫:[Ll/᩶ܺ᩵;

    goto :goto_0

    .line 191
    :cond_0
    new-instance p1, Ll/۫ܺ᩵;

    const-string v0, "invalid array conformance"

    .line 58
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 191
    throw p1

    .line 194
    :cond_1
    :goto_0
    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->ܽ(I)Ll/۬ܺ᩵;

    move-result-object p1

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    .line 196
    iget-object v2, p0, Ll/ۗܺ᩵;->֫:[Ll/᩶ܺ᩵;

    aget-object v3, v2, v1

    if-nez v3, :cond_2

    .line 197
    new-instance v3, Ll/᩶ܺ᩵;

    .line 24
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 197
    aput-object v3, v2, v1

    .line 199
    :cond_2
    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Ll/᩶ܺ᩵;->֫(Ll/۬ܺ᩵;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final ۧ(Ll/۬ܺ᩵;)V
    .locals 3

    const/4 v0, 0x4

    .line 158
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ۧ(I)V

    .line 159
    iget v0, p0, Ll/ۗܺ᩵;->ۧ:I

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 160
    iget-object v0, p0, Ll/ۗܺ᩵;->֫:[Ll/᩶ܺ᩵;

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->֫(Ljava/lang/Object;)V

    .line 162
    iget-object v0, p0, Ll/ۗܺ᩵;->֫:[Ll/᩶ܺ᩵;

    if-eqz v0, :cond_0

    .line 163
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 164
    iget v0, p0, Ll/ۗܺ᩵;->ۧ:I

    .line 165
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 166
    iget v1, p1, Ll/۬ܺ᩵;->ܽ:I

    mul-int/lit8 v2, v0, 0xc

    .line 167
    invoke-virtual {p1, v2}, Ll/۬ܺ᩵;->֫(I)V

    .line 169
    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->ܽ(I)Ll/۬ܺ᩵;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 171
    iget-object v2, p0, Ll/ۗܺ᩵;->֫:[Ll/᩶ܺ᩵;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Ll/᩶ܺ᩵;->ۧ(Ll/۬ܺ᩵;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
