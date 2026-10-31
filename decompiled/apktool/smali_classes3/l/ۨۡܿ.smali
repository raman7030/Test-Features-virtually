.class public final Ll/ۨۡܿ;
.super Ljava/lang/Object;
.source "R704"


# instance fields
.field public final ֫:Ll/ۛۡܿ;

.field public volatile ۖ:J

.field public final ۘ:Ll/۟ۡܿ;

.field public final ۜ:Ll/᩺ۡܿ;

.field public final ۡ:Ll/᩶᩸ᩳ;

.field public final ۢ:Ll/᩺ܺܿ;

.field public volatile ۧ:Z

.field public final ܳ:Ll/᩷ۢܿ;

.field public final ܺ:I

.field public final ܽ:Ll/ܶۘܿ;

.field public final ܿ:I

.field public final ᩳ:Ll/ۢۖܿ;

.field public final ᩴ:I

.field public final ᩵:I

.field public final ᩷:I

.field public final ᩻:J


# direct methods
.method public constructor <init>(JLl/᩷ۢܿ;Ll/᩺ۡܿ;Ll/ۛۡܿ;Ll/ܶۘܿ;Ll/ۢۖܿ;IIILl/۟ۡܿ;)V
    .locals 0

    .line 1172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1173
    iput-wide p1, p0, Ll/ۨۡܿ;->᩻:J

    .line 1174
    iput-object p3, p0, Ll/ۨۡܿ;->ܳ:Ll/᩷ۢܿ;

    .line 1175
    iget-object p1, p3, Ll/᩷ۢܿ;->ܽ:Ll/᩺ܺܿ;

    iput-object p1, p0, Ll/ۨۡܿ;->ۢ:Ll/᩺ܺܿ;

    .line 1176
    iget-object p1, p3, Ll/᩷ۢܿ;->ᩳ:Ll/᩶᩸ᩳ;

    iput-object p1, p0, Ll/ۨۡܿ;->ۡ:Ll/᩶᩸ᩳ;

    .line 1177
    iget p1, p3, Ll/᩷ۢܿ;->ۧ:I

    iput p1, p0, Ll/ۨۡܿ;->᩷:I

    .line 1178
    iget p1, p3, Ll/᩷ۢܿ;->ܿ:I

    iput p1, p0, Ll/ۨۡܿ;->ܺ:I

    .line 1179
    iput-object p4, p0, Ll/ۨۡܿ;->ۜ:Ll/᩺ۡܿ;

    .line 1180
    iput-object p5, p0, Ll/ۨۡܿ;->֫:Ll/ۛۡܿ;

    .line 1181
    iput-object p11, p0, Ll/ۨۡܿ;->ۘ:Ll/۟ۡܿ;

    .line 1182
    iput-object p7, p0, Ll/ۨۡܿ;->ᩳ:Ll/ۢۖܿ;

    .line 1183
    iput p8, p0, Ll/ۨۡܿ;->ܿ:I

    .line 1184
    iput-object p6, p0, Ll/ۨۡܿ;->ܽ:Ll/ܶۘܿ;

    .line 1185
    iput p9, p0, Ll/ۨۡܿ;->᩵:I

    .line 1186
    iput p10, p0, Ll/ۨۡܿ;->ᩴ:I

    .line 1187
    invoke-static {p4}, Ll/᩺ۡܿ;->֫(Ll/᩺ۡܿ;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p9, 0x0

    .line 1188
    :goto_0
    invoke-static {p4}, Ll/᩺ۡܿ;->֫(Ll/᩺ۡܿ;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    iget-object p2, p3, Ll/᩷ۢܿ;->֫:Ll/᩺᩷ܿ;

    iget p2, p2, Ll/᩺᩷ܿ;->ۧ:I

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p10

    :goto_1
    int-to-long p1, p9

    const/16 p3, 0x20

    shl-long/2addr p1, p3

    int-to-long p3, p10

    const-wide p5, 0xffffffffL

    and-long/2addr p3, p5

    or-long/2addr p1, p3

    .line 1187
    iput-wide p1, p0, Ll/ۨۡܿ;->ۖ:J

    return-void
.end method

.method public static ֡(Ll/ۨۡܿ;)Z
    .locals 0

    .line 1208
    iget-object p0, p0, Ll/ۨۡܿ;->ܳ:Ll/᩷ۢܿ;

    invoke-virtual {p0}, Ll/᩷ۢܿ;->֫()Z

    move-result p0

    return p0
.end method

.method public static ֨(Ll/ۨۡܿ;)I
    .locals 0

    .line 1193
    iget p0, p0, Ll/ۨۡܿ;->᩵:I

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ۨۡܿ;)Ll/ۛۡܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨۡܿ;->֫:Ll/ۛۡܿ;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۨۡܿ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۨۡܿ;->ۖ:J

    return-void
.end method

.method public static bridge synthetic ۖ(Ll/ۨۡܿ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۨۡܿ;->ۖ:J

    return-wide v0
.end method

.method public static bridge synthetic ۘ(Ll/ۨۡܿ;)Ll/۟ۡܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨۡܿ;->ۘ:Ll/۟ۡܿ;

    return-object p0
.end method

.method public static ۚ(Ll/ۨۡܿ;)I
    .locals 0

    .line 1198
    iget p0, p0, Ll/ۨۡܿ;->ᩴ:I

    return p0
.end method

.method public static bridge synthetic ۜ(Ll/ۨۡܿ;)Ll/᩺ۡܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨۡܿ;->ۜ:Ll/᩺ۡܿ;

    return-object p0
.end method

.method public static bridge synthetic ۡ(Ll/ۨۡܿ;)Ll/᩶᩸ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨۡܿ;->ۡ:Ll/᩶᩸ᩳ;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ۨۡܿ;)Ll/᩺ܺܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨۡܿ;->ۢ:Ll/᩺ܺܿ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۨۡܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۨۡܿ;->ۧ:Z

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/ۨۡܿ;)Ll/᩷ۢܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨۡܿ;->ܳ:Ll/᩷ۢܿ;

    return-object p0
.end method

.method public static bridge synthetic ܺ(Ll/ۨۡܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۨۡܿ;->ܺ:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ۨۡܿ;)Ll/ܶۘܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨۡܿ;->ܽ:Ll/ܶۘܿ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۨۡܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۨۡܿ;->ܿ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۨۡܿ;)Ll/ۢۖܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۨۡܿ;->ᩳ:Ll/ۢۖܿ;

    return-object p0
.end method

.method public static ᩴ(Ll/ۨۡܿ;)V
    .locals 1

    const/4 v0, 0x1

    .line 1212
    iput-boolean v0, p0, Ll/ۨۡܿ;->ۧ:Z

    return-void
.end method

.method public static ᩵(Ll/ۨۡܿ;)Z
    .locals 0

    .line 1203
    iget-boolean p0, p0, Ll/ۨۡܿ;->ۧ:Z

    return p0
.end method

.method public static bridge synthetic ᩷(Ll/ۨۡܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۨۡܿ;->᩷:I

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/ۨۡܿ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۨۡܿ;->᩻:J

    return-wide v0
.end method
