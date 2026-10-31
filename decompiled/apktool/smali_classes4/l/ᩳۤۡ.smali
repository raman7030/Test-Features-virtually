.class public final Ll/ᩳۤۡ;
.super Ljava/lang/Object;
.source "A5R0"


# instance fields
.field public final ֫:Ljava/text/SimpleDateFormat;

.field public final ۧ:Ljava/text/SimpleDateFormat;

.field public final ܽ:Ljava/text/SimpleDateFormat;

.field public final ᩳ:Ljava/text/SimpleDateFormat;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-direct {v0, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/ᩳۤۡ;->֫:Ljava/text/SimpleDateFormat;

    .line 174
    new-instance p1, Ljava/text/SimpleDateFormat;

    invoke-direct {p1, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ll/ᩳۤۡ;->ۧ:Ljava/text/SimpleDateFormat;

    .line 175
    new-instance p2, Ljava/text/SimpleDateFormat;

    invoke-direct {p2, p3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Ll/ᩳۤۡ;->ᩳ:Ljava/text/SimpleDateFormat;

    .line 176
    new-instance p3, Ljava/text/SimpleDateFormat;

    invoke-direct {p3, p4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object p3, p0, Ll/ᩳۤۡ;->ܽ:Ljava/text/SimpleDateFormat;

    const/4 p4, 0x0

    .line 177
    invoke-virtual {v0, p4}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 178
    invoke-virtual {p1, p4}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 179
    invoke-virtual {p2, p4}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 180
    invoke-virtual {p3, p4}, Ljava/text/DateFormat;->setLenient(Z)V

    return-void
.end method


# virtual methods
.method public final ֫(JZZ)Ljava/lang/String;
    .locals 0

    if-eqz p3, :cond_1

    if-eqz p4, :cond_0

    .line 211
    iget-object p3, p0, Ll/ᩳۤۡ;->֫:Ljava/text/SimpleDateFormat;

    goto :goto_0

    .line 213
    :cond_0
    iget-object p3, p0, Ll/ᩳۤۡ;->ᩳ:Ljava/text/SimpleDateFormat;

    goto :goto_0

    :cond_1
    if-eqz p4, :cond_2

    .line 217
    iget-object p3, p0, Ll/ᩳۤۡ;->ۧ:Ljava/text/SimpleDateFormat;

    goto :goto_0

    .line 219
    :cond_2
    iget-object p3, p0, Ll/ᩳۤۡ;->ܽ:Ljava/text/SimpleDateFormat;

    .line 222
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
