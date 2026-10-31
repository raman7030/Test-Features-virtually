.class public final Ll/ۚ᩺ۜ;
.super Ljava/lang/Object;
.source "V6MU"


# instance fields
.field public volatile ֫:Z

.field public final ۜ:Ll/ܰۛۜ;

.field public final ۡ:Ll/ۡܰۜ;

.field public final ۢ:Ll/᩻ܰۜ;

.field public final ۧ:J

.field public final ܳ:Z

.field public final ܺ:Z

.field public final ܽ:J

.field public ܿ:Z

.field public final ᩳ:Ll/ܶ᩺ۜ;

.field public final ᩷:J

.field public final ᩻:Ll/ܰۛۜ;


# direct methods
.method public constructor <init>(Ll/ܶ᩺ۜ;Ll/ۡܰۜ;ZJJ)V
    .locals 2

    .line 1155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1156
    iput-object p1, p0, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    .line 1157
    iput-object p2, p0, Ll/ۚ᩺ۜ;->ۡ:Ll/ۡܰۜ;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    .line 1158
    iget-object p2, p1, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    iput-object p2, p0, Ll/ۚ᩺ۜ;->᩻:Ll/ܰۛۜ;

    .line 1159
    iput-object v0, p0, Ll/ۚ᩺ۜ;->ۢ:Ll/᩻ܰۜ;

    .line 1160
    iput-object v0, p0, Ll/ۚ᩺ۜ;->ۜ:Ll/ܰۛۜ;

    const-wide/16 v0, 0x0

    .line 1161
    iput-wide v0, p0, Ll/ۚ᩺ۜ;->᩷:J

    .line 1162
    iput-boolean p3, p0, Ll/ۚ᩺ۜ;->ܺ:Z

    .line 1163
    iget-boolean p1, p1, Ll/ܶ᩺ۜ;->᩸:Z

    iput-boolean p1, p0, Ll/ۚ᩺ۜ;->ܳ:Z

    .line 1164
    iput-wide p4, p0, Ll/ۚ᩺ۜ;->ۧ:J

    .line 1165
    iput-wide p6, p0, Ll/ۚ᩺ۜ;->ܽ:J

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩺ۜ;Ll/᩻ܰۜ;JJ)V
    .locals 1

    .line 1168
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1169
    iput-object p1, p0, Ll/ۚ᩺ۜ;->ᩳ:Ll/ܶ᩺ۜ;

    const/4 v0, 0x0

    .line 1170
    iput-object v0, p0, Ll/ۚ᩺ۜ;->ۡ:Ll/ۡܰۜ;

    .line 1171
    iput-object p2, p0, Ll/ۚ᩺ۜ;->ۢ:Ll/᩻ܰۜ;

    .line 1172
    iput-object v0, p0, Ll/ۚ᩺ۜ;->᩻:Ll/ܰۛۜ;

    .line 1173
    iget-object p2, p1, Ll/ܶ᩺ۜ;->᩻:Ll/ܰۛۜ;

    iput-object p2, p0, Ll/ۚ᩺ۜ;->ۜ:Ll/ܰۛۜ;

    .line 1174
    invoke-virtual {p1}, Ll/ܶ᩺ۜ;->ܽ()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۚ᩺ۜ;->᩷:J

    const/4 p1, 0x0

    .line 1175
    iput-boolean p1, p0, Ll/ۚ᩺ۜ;->ܺ:Z

    .line 1176
    iput-boolean p1, p0, Ll/ۚ᩺ۜ;->ܳ:Z

    .line 1177
    iput-wide p3, p0, Ll/ۚ᩺ۜ;->ۧ:J

    .line 1178
    iput-wide p5, p0, Ll/ۚ᩺ۜ;->ܽ:J

    return-void
.end method
