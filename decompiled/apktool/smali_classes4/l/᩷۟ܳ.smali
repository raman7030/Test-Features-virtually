.class public final synthetic Ll/᩷۟ܳ;
.super Ljava/lang/Object;
.source "B29A"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ll/ۖۢܳ;

.field public final synthetic ۙ:Ll/ܶ᩵ܿ;

.field public final synthetic ۬:Ll/۬ۗܿ;

.field public final synthetic ᩶:Ll/ܶ᩵ܿ;

.field public final synthetic ᩸:[Landroid/widget/RadioButton;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>([Landroid/widget/RadioButton;ILl/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۖۢܳ;Ll/۬ۗܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷۟ܳ;->᩸:[Landroid/widget/RadioButton;

    iput p2, p0, Ll/᩷۟ܳ;->᩹:I

    iput-object p3, p0, Ll/᩷۟ܳ;->᩶:Ll/ܶ᩵ܿ;

    iput-object p4, p0, Ll/᩷۟ܳ;->ۙ:Ll/ܶ᩵ܿ;

    iput-object p5, p0, Ll/᩷۟ܳ;->ۗ:Ll/ۖۢܳ;

    iput-object p6, p0, Ll/᩷۟ܳ;->۬:Ll/۬ۗܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    const/4 p1, 0x0

    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x4

    if-ge p2, v0, :cond_1

    .line 223
    iget-object v0, p0, Ll/᩷۟ܳ;->᩸:[Landroid/widget/RadioButton;

    aget-object v0, v0, p2

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 228
    :goto_1
    iget v0, p0, Ll/᩷۟ܳ;->᩹:I

    if-eq v0, p2, :cond_2

    .line 229
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "rco"

    int-to-byte v2, p2

    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->֫(BLjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 232
    :cond_2
    iget-object v0, p0, Ll/᩷۟ܳ;->᩶:Ll/ܶ᩵ܿ;

    iget-object v1, p0, Ll/᩷۟ܳ;->ۙ:Ll/ܶ᩵ܿ;

    const-string v2, ".tmp"

    const/4 v3, 0x1

    const v4, 0x7f120881

    if-eqz p2, :cond_c

    if-eq p2, v3, :cond_7

    const/4 v2, 0x2

    if-eq p2, v2, :cond_5

    const/4 v2, 0x3

    if-eq p2, v2, :cond_3

    goto/16 :goto_2

    .line 285
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ".bak"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array p1, p1, [Ljava/lang/String;

    invoke-static {v2, p1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 1147
    invoke-virtual {p1, v3}, Ll/ܶ᩵ܿ;->֫(Z)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 286
    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v2

    if-nez v2, :cond_4

    const p1, 0x7f120117

    .line 287
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 290
    :cond_4
    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v2

    if-nez v2, :cond_10

    .line 291
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    .line 292
    invoke-static {v4}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 274
    :cond_5
    new-instance p1, Ll/ۨۘᩳ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܿۖ᩷;)Z

    move-result p1

    if-nez p1, :cond_6

    const p1, 0x7f120643

    .line 275
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 278
    :cond_6
    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p1

    if-nez p1, :cond_f

    .line 279
    invoke-static {v4}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 899
    :cond_7
    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 253
    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 254
    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 255
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    goto :goto_2

    .line 257
    :cond_8
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    .line 258
    invoke-static {v4}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 261
    :cond_9
    invoke-virtual {v1, p1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 262
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v2

    if-nez v2, :cond_f

    .line 263
    :cond_a
    invoke-virtual {p1, v1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    .line 264
    invoke-static {v4}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 268
    :cond_b
    invoke-static {v4}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 899
    :cond_c
    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 236
    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v2

    if-nez v2, :cond_d

    .line 237
    invoke-static {v4}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 240
    :cond_d
    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v2

    if-nez v2, :cond_e

    .line 241
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    .line 242
    invoke-static {v4}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 245
    :cond_e
    invoke-virtual {p1, v1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    :cond_f
    :goto_2
    const/4 p1, 0x0

    :cond_10
    if-eqz p2, :cond_11

    .line 298
    sget p2, Ll/ܳۤܳ;->֫:I

    .line 225
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/ܳۤܳ;->ᩳ(Ljava/lang/String;)V

    goto :goto_3

    .line 300
    :cond_11
    sget p2, Ll/ܳۤܳ;->֫:I

    .line 213
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p2

    .line 217
    invoke-static {p2, v3}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    .line 213
    :goto_3
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p2

    .line 217
    invoke-static {p2, v3}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    if-eqz p1, :cond_12

    .line 213
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    .line 217
    invoke-static {p1, v3}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    .line 306
    :cond_12
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ll/᩷۟ܳ;->ۗ:Ll/ۖۢܳ;

    invoke-virtual {p2, p1}, Ll/ۖۢܳ;->ܽ(Ljava/lang/String;)V

    .line 307
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 308
    invoke-static {}, Ll/ۡᩴܳ;->᩻()V

    .line 309
    iget-object p1, p0, Ll/᩷۟ܳ;->۬:Ll/۬ۗܿ;

    invoke-virtual {p1}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
