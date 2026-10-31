.class public final Ll/ܳܽۧ;
.super Ljava/lang/Object;
.source "P8NZ"

# interfaces
.implements Ll/ۡۧۧ;


# instance fields
.field public ֫:I

.field public final ۧ:Ll/ܶ۠֫;

.field public ܳ:Ll/۠ᩴ֫;

.field public ܽ:Ll/ۘۛ֫;

.field public ܿ:Ll/ۚᩴᩳ;

.field public ᩳ:Ll/ۧܳۧ;


# direct methods
.method public constructor <init>(Ll/ܶ۠֫;Ll/᩶᩷ۧ;)V
    .locals 2

    .line 134
    new-instance v0, Ll/ۚᩴᩳ;

    invoke-direct {v0, p2}, Ll/ۚᩴᩳ;-><init>(Ljava/lang/Object;)V

    .line 155
    new-instance p2, Ll/ۘۛ֫;

    invoke-direct {p2}, Ll/ۘۛ֫;-><init>()V

    new-instance v1, Ll/᩺ܿۧ;

    .line 76
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 183
    iput-object p1, p0, Ll/ܳܽۧ;->ۧ:Ll/ܶ۠֫;

    .line 184
    iput-object v0, p0, Ll/ܳܽۧ;->ܿ:Ll/ۚᩴᩳ;

    .line 185
    iput-object p2, p0, Ll/ܳܽۧ;->ܽ:Ll/ۘۛ֫;

    .line 186
    iput-object v1, p0, Ll/ܳܽۧ;->ᩳ:Ll/ۧܳۧ;

    const/high16 p1, 0x100000

    .line 187
    iput p1, p0, Ll/ܳܽۧ;->֫:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic ֫(Ll/ۧ᩵֫;)Ll/ۘۧۧ;
    .locals 0

    .line 86
    invoke-virtual {p0, p1}, Ll/ܳܽۧ;->֫(Ll/ۧ᩵֫;)Ll/᩻ܽۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ۡۧۧ;
    .locals 0

    return-object p0
.end method

.method public final ֫(Ll/ۤۘۧ;)Ll/ۡۧۧ;
    .locals 0

    return-object p0
.end method

.method public final bridge synthetic ֫(Ll/ۧܳۧ;)Ll/ۡۧۧ;
    .locals 0

    .line 86
    invoke-virtual {p0, p1}, Ll/ܳܽۧ;->ۧ(Ll/ۧܳۧ;)V

    return-object p0
.end method

.method public final ֫(Z)Ll/ۡۧۧ;
    .locals 0

    return-object p0
.end method

.method public final ֫(Ll/ۧ᩵֫;)Ll/᩻ܽۧ;
    .locals 9

    .line 289
    iget-object v0, p1, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    new-instance v0, Ll/᩻ܽۧ;

    iget-object v1, p0, Ll/ܳܽۧ;->ܽ:Ll/ۘۛ֫;

    .line 294
    invoke-virtual {v1, p1}, Ll/ۘۛ֫;->֫(Ll/ۧ᩵֫;)Ll/ۙۛ֫;

    move-result-object v5

    iget-object v6, p0, Ll/ܳܽۧ;->ᩳ:Ll/ۧܳۧ;

    iget v7, p0, Ll/ܳܽۧ;->֫:I

    iget-object v8, p0, Ll/ܳܽۧ;->ܳ:Ll/۠ᩴ֫;

    iget-object v3, p0, Ll/ܳܽۧ;->ۧ:Ll/ܶ۠֫;

    iget-object v4, p0, Ll/ܳܽۧ;->ܿ:Ll/ۚᩴᩳ;

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Ll/᩻ܽۧ;-><init>(Ll/ۧ᩵֫;Ll/ܶ۠֫;Ll/ۚᩴᩳ;Ll/ۙۛ֫;Ll/ۧܳۧ;ILl/۠ᩴ֫;)V

    return-object v0
.end method

.method public final ֫(Ll/۠ᩴ֫;)V
    .locals 0

    .line 233
    iput-object p1, p0, Ll/ܳܽۧ;->ܳ:Ll/۠ᩴ֫;

    return-void
.end method

.method public final ۧ(Ll/ۧܳۧ;)V
    .locals 1

    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 194
    invoke-static {p1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ll/ܳܽۧ;->ᩳ:Ll/ۧܳۧ;

    return-void
.end method
