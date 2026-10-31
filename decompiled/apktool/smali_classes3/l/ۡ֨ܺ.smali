.class public final Ll/ۡ֨ܺ;
.super Ljava/lang/Object;
.source "TB7B"


# instance fields
.field public ֫:Landroid/graphics/Paint;

.field public ۜ:Ll/ܿ֡ܺ;

.field public ۧ:Z

.field public ܳ:Ll/᩷ۚܺ;

.field public ܽ:Z

.field public ܿ:Landroid/graphics/Paint;

.field public ᩳ:Z

.field public ᩻:Ll/ܿ֡ܺ;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll/ۡ֨ܺ;->֫:Landroid/graphics/Paint;

    const/16 v1, 0xc1

    .line 141
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFlags(I)V

    const/4 v2, 0x0

    .line 143
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setHinting(I)V

    .line 145
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 146
    sget-object v3, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 148
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll/ۡ֨ܺ;->ܿ:Landroid/graphics/Paint;

    .line 149
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFlags(I)V

    .line 151
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setHinting(I)V

    .line 153
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 154
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 156
    invoke-static {}, Ll/᩷ۚܺ;->֫()Ll/᩷ۚܺ;

    move-result-object v0

    iput-object v0, p0, Ll/ۡ֨ܺ;->ܳ:Ll/᩷ۚܺ;

    return-void
.end method

.method public constructor <init>(Ll/ۡ֨ܺ;)V
    .locals 2

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    iget-boolean v0, p1, Ll/ۡ֨ܺ;->ۧ:Z

    iput-boolean v0, p0, Ll/ۡ֨ܺ;->ۧ:Z

    .line 162
    iget-boolean v0, p1, Ll/ۡ֨ܺ;->ܽ:Z

    iput-boolean v0, p0, Ll/ۡ֨ܺ;->ܽ:Z

    .line 163
    new-instance v0, Landroid/graphics/Paint;

    iget-object v1, p1, Ll/ۡ֨ܺ;->֫:Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v0, p0, Ll/ۡ֨ܺ;->֫:Landroid/graphics/Paint;

    .line 164
    new-instance v0, Landroid/graphics/Paint;

    iget-object v1, p1, Ll/ۡ֨ܺ;->ܿ:Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v0, p0, Ll/ۡ֨ܺ;->ܿ:Landroid/graphics/Paint;

    .line 165
    iget-object v0, p1, Ll/ۡ֨ܺ;->ۜ:Ll/ܿ֡ܺ;

    if-eqz v0, :cond_0

    .line 166
    new-instance v1, Ll/ܿ֡ܺ;

    invoke-direct {v1, v0}, Ll/ܿ֡ܺ;-><init>(Ll/ܿ֡ܺ;)V

    iput-object v1, p0, Ll/ۡ֨ܺ;->ۜ:Ll/ܿ֡ܺ;

    .line 167
    :cond_0
    iget-object v0, p1, Ll/ۡ֨ܺ;->᩻:Ll/ܿ֡ܺ;

    if-eqz v0, :cond_1

    .line 168
    new-instance v1, Ll/ܿ֡ܺ;

    invoke-direct {v1, v0}, Ll/ܿ֡ܺ;-><init>(Ll/ܿ֡ܺ;)V

    iput-object v1, p0, Ll/ۡ֨ܺ;->᩻:Ll/ܿ֡ܺ;

    .line 169
    :cond_1
    iget-boolean v0, p1, Ll/ۡ֨ܺ;->ᩳ:Z

    iput-boolean v0, p0, Ll/ۡ֨ܺ;->ᩳ:Z

    .line 172
    :try_start_0
    iget-object p1, p1, Ll/ۡ֨ܺ;->ܳ:Ll/᩷ۚܺ;

    invoke-virtual {p1}, Ll/᩷ۚܺ;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ۚܺ;

    iput-object p1, p0, Ll/ۡ֨ܺ;->ܳ:Ll/᩷ۚܺ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 178
    :catch_0
    invoke-static {}, Ll/᩷ۚܺ;->֫()Ll/᩷ۚܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ۡ֨ܺ;->ܳ:Ll/᩷ۚܺ;

    return-void
.end method
