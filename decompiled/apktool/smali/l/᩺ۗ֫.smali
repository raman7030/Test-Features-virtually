.class public final Ll/᩺ۗ֫;
.super Ll/ܰ֫ۧ;
.source "18TA"


# instance fields
.field public final ܽ:Ll/᩶᩵֫;


# direct methods
.method public constructor <init>(Ll/ۙ᩵֫;)V
    .locals 0

    .line 140
    invoke-direct {p0, p1}, Ll/ܰ֫ۧ;-><init>(Ll/ۙ᩵֫;)V

    .line 141
    new-instance p1, Ll/᩶᩵֫;

    invoke-direct {p1}, Ll/᩶᩵֫;-><init>()V

    iput-object p1, p0, Ll/᩺ۗ֫;->ܽ:Ll/᩶᩵֫;

    return-void
.end method


# virtual methods
.method public final ֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;
    .locals 10

    .line 145
    invoke-super {p0, p1, p2, p3}, Ll/ܰ֫ۧ;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    move-result-object p1

    .line 146
    iget p3, p1, Ll/᩹᩵֫;->᩻:I

    iget-object v0, p0, Ll/᩺ۗ֫;->ܽ:Ll/᩶᩵֫;

    const-wide/16 v1, 0x0

    .line 1097
    invoke-virtual {p0, p3, v0, v1, v2}, Ll/ܰ֫ۧ;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object p3

    .line 146
    invoke-virtual {p3}, Ll/᩶᩵֫;->֫()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 148
    iget-object v1, p2, Ll/᩹᩵֫;->ܽ:Ljava/lang/Object;

    iget-object v2, p2, Ll/᩹᩵֫;->ܳ:Ljava/lang/Object;

    iget v3, p2, Ll/᩹᩵֫;->᩻:I

    iget-wide v4, p2, Ll/᩹᩵֫;->ۧ:J

    iget-wide v6, p2, Ll/᩹᩵֫;->ܿ:J

    sget-object v8, Ll/۟ۘ֫;->ܽ:Ll/۟ۘ֫;

    const/4 v9, 0x1

    move-object v0, p1

    invoke-virtual/range {v0 .. v9}, Ll/᩹᩵֫;->֫(Ljava/lang/Object;Ljava/lang/Object;IJJLl/۟ۘ֫;Z)V

    return-object p1

    :cond_0
    const/4 p2, 0x1

    .line 157
    iput-boolean p2, p1, Ll/᩹᩵֫;->ᩳ:Z

    return-object p1
.end method
