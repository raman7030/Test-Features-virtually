.class public final Ll/᩶ۤ֫;
.super Ljava/lang/Object;
.source "P8OZ"

# interfaces
.implements Ll/᩸۫֫;


# instance fields
.field public final synthetic ֫:Ll/ۙۤ֫;


# direct methods
.method public constructor <init>(Ll/ۙۤ֫;)V
    .locals 0

    .line 1115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۤ֫;->֫:Ll/ۙۤ֫;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 1124
    iget-object v0, p0, Ll/᩶ۤ֫;->֫:Ll/ۙۤ֫;

    invoke-static {v0}, Ll/ۙۤ֫;->ܽ(Ll/ۙۤ֫;)V

    return-void
.end method

.method public final ֫(I)V
    .locals 3

    .line 1181
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    iget-object v2, p0, Ll/᩶ۤ֫;->֫:Ll/ۙۤ֫;

    if-lt v0, v1, :cond_0

    invoke-static {v2}, Ll/ۙۤ֫;->ۧ(Ll/ۙۤ֫;)Ll/ۨܰ֫;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1182
    invoke-static {v2}, Ll/ۙۤ֫;->ۧ(Ll/ۙۤ֫;)Ll/ۨܰ֫;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۨܰ֫;->֫(I)V

    .line 1184
    :cond_0
    invoke-static {v2}, Ll/ۙۤ֫;->֫(Ll/ۙۤ֫;)Ll/֡۫֫;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֡۫֫;->֫(I)V

    return-void
.end method

.method public final ֫(J)V
    .locals 1

    .line 1129
    iget-object v0, p0, Ll/᩶ۤ֫;->֫:Ll/ۙۤ֫;

    invoke-static {v0}, Ll/ۙۤ֫;->֫(Ll/ۙۤ֫;)Ll/֡۫֫;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/֡۫֫;->֫(J)V

    return-void
.end method

.method public final ֫(JIJ)V
    .locals 7

    .line 1134
    iget-object v0, p0, Ll/᩶ۤ֫;->֫:Ll/ۙۤ֫;

    invoke-static {v0}, Ll/ۙۤ֫;->֫(Ll/ۙۤ֫;)Ll/֡۫֫;

    move-result-object v1

    move-wide v2, p1

    move v4, p3

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Ll/֡۫֫;->֫(JIJ)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "Audio sink error"

    .line 1160
    invoke-static {v0, p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1161
    iget-object v0, p0, Ll/᩶ۤ֫;->֫:Ll/ۙۤ֫;

    invoke-static {v0}, Ll/ۙۤ֫;->֫(Ll/ۙۤ֫;)Ll/֡۫֫;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֡۫֫;->ۧ(Ljava/lang/Exception;)V

    return-void
.end method

.method public final ֫(Ll/֨۫֫;)V
    .locals 1

    .line 1171
    iget-object v0, p0, Ll/᩶ۤ֫;->֫:Ll/ۙۤ֫;

    invoke-static {v0}, Ll/ۙۤ֫;->֫(Ll/ۙۤ֫;)Ll/֡۫֫;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֡۫֫;->֫(Ll/֨۫֫;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 1139
    iget-object v0, p0, Ll/᩶ۤ֫;->֫:Ll/ۙۤ֫;

    invoke-static {v0}, Ll/ۙۤ֫;->֫(Ll/ۙۤ֫;)Ll/֡۫֫;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֡۫֫;->֫(Z)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 1152
    iget-object v0, p0, Ll/᩶ۤ֫;->֫:Ll/ۙۤ֫;

    invoke-static {v0}, Ll/ۙۤ֫;->ܿ(Ll/ۙۤ֫;)Ll/۟ۗ֫;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1154
    invoke-interface {v0}, Ll/۟ۗ֫;->֫()V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/֨۫֫;)V
    .locals 1

    .line 1176
    iget-object v0, p0, Ll/᩶ۤ֫;->֫:Ll/ۙۤ֫;

    invoke-static {v0}, Ll/ۙۤ֫;->֫(Ll/ۙۤ֫;)Ll/֡۫֫;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֡۫֫;->ۧ(Ll/֨۫֫;)V

    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 1166
    iget-object v0, p0, Ll/᩶ۤ֫;->֫:Ll/ۙۤ֫;

    invoke-static {v0}, Ll/ۙۤ֫;->ܳ(Ll/ۙۤ֫;)V

    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 1144
    iget-object v0, p0, Ll/᩶ۤ֫;->֫:Ll/ۙۤ֫;

    invoke-static {v0}, Ll/ۙۤ֫;->ᩳ(Ll/ۙۤ֫;)Ll/۟ۗ֫;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1146
    invoke-interface {v0}, Ll/۟ۗ֫;->ۧ()V

    :cond_0
    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 1119
    iget-object v0, p0, Ll/᩶ۤ֫;->֫:Ll/ۙۤ֫;

    invoke-virtual {v0}, Ll/ۙۤ֫;->ۙ֫()V

    return-void
.end method
