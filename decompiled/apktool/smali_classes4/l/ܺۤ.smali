.class public final Ll/ܺۤ;
.super Ljava/lang/Object;
.source "S2ZO"


# instance fields
.field public ֫:I

.field public ۧ:Z

.field public ܽ:Ll/ܶۤ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 52
    invoke-static {v0}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 167
    :goto_0
    iput-boolean v1, p0, Ll/ܺۤ;->ۧ:Z

    .line 168
    sget-object v0, Ll/ۘۤ;->᩻:Ll/ܶۤ;

    iput-object v0, p0, Ll/ܺۤ;->ܽ:Ll/ܶۤ;

    const/4 v0, 0x2

    .line 169
    iput v0, p0, Ll/ܺۤ;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۘۤ;
    .locals 4

    .line 205
    iget v0, p0, Ll/ܺۤ;->֫:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ll/ܺۤ;->ܽ:Ll/ܶۤ;

    sget-object v1, Ll/ۘۤ;->᩻:Ll/ܶۤ;

    if-ne v0, v1, :cond_1

    .line 207
    iget-boolean v0, p0, Ll/ܺۤ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 198
    sget-object v0, Ll/ۘۤ;->ܳ:Ll/ۘۤ;

    return-object v0

    :cond_0
    sget-object v0, Ll/ۘۤ;->ܿ:Ll/ۘۤ;

    return-object v0

    .line 209
    :cond_1
    new-instance v0, Ll/ۘۤ;

    iget v1, p0, Ll/ܺۤ;->֫:I

    iget-object v2, p0, Ll/ܺۤ;->ܽ:Ll/ܶۤ;

    iget-boolean v3, p0, Ll/ܺۤ;->ۧ:Z

    invoke-direct {v0, v3, v1, v2}, Ll/ۘۤ;-><init>(ZILl/ܶۤ;)V

    return-object v0
.end method
