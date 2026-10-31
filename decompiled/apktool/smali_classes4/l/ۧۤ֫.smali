.class public final Ll/ۧۤ֫;
.super Ljava/lang/Object;
.source "Q8S0"

# interfaces
.implements Ll/ܳۤ֫;


# instance fields
.field public final ֫:Landroid/content/Context;

.field public ۧ:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/ۧۤ֫;->֫:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩳᩴ֫;Ll/۠ᩴ֫;)Ll/ܺ۫֫;
    .locals 5

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p2, Ll/۠ᩴ֫;->ܽ֫:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_8

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    goto/16 :goto_4

    .line 116
    :cond_0
    iget-object v2, p0, Ll/ۧۤ֫;->ۧ:Ljava/lang/Boolean;

    if-eqz v2, :cond_1

    .line 117
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_2

    .line 120
    :cond_1
    iget-object v2, p0, Ll/ۧۤ֫;->֫:Landroid/content/Context;

    if-eqz v2, :cond_3

    .line 121
    invoke-static {v2}, Ll/ۖ֡֫;->֫(Landroid/content/Context;)Landroid/media/AudioManager;

    move-result-object v2

    const-string v3, "offloadVariableRateSupported"

    .line 123
    invoke-virtual {v2, v3}, Landroid/media/AudioManager;->getParameters(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "offloadVariableRateSupported=1"

    .line 126
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 125
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p0, Ll/ۧۤ֫;->ۧ:Ljava/lang/Boolean;

    goto :goto_1

    .line 129
    :cond_3
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v2, p0, Ll/ۧۤ֫;->ۧ:Ljava/lang/Boolean;

    .line 131
    :goto_1
    iget-object v2, p0, Ll/ۧۤ֫;->ۧ:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 84
    :goto_2
    iget-object v3, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    iget-object v4, p2, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    invoke-static {v3, v4}, Ll/ۢ᩵֫;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    if-eqz v3, :cond_7

    .line 86
    invoke-static {v3}, Ll/ۘ֨֫;->֫(I)I

    move-result v4

    if-ge v1, v4, :cond_4

    goto :goto_3

    .line 91
    :cond_4
    iget p2, p2, Ll/۠ᩴ֫;->ܿ:I

    invoke-static {p2}, Ll/ۘ֨֫;->ۧ(I)I

    move-result p2

    if-nez p2, :cond_5

    .line 93
    sget-object p1, Ll/ܺ۫֫;->ᩳ:Ll/ܺ۫֫;

    return-object p1

    .line 98
    :cond_5
    :try_start_0
    invoke-static {v0, p2, v3}, Ll/ۘ֨֫;->ۧ(III)Landroid/media/AudioFormat;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0x1f

    if-lt v1, v0, :cond_6

    .line 106
    invoke-virtual {p1}, Ll/ᩳᩴ֫;->֫()Ll/ܽᩴ֫;

    move-result-object p1

    iget-object p1, p1, Ll/ܽᩴ֫;->֫:Landroid/media/AudioAttributes;

    .line 104
    invoke-static {p2, p1, v2}, Ll/֫ۤ֫;->֫(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;Z)Ll/ܺ۫֫;

    move-result-object p1

    return-object p1

    .line 111
    :cond_6
    invoke-virtual {p1}, Ll/ᩳᩴ֫;->֫()Ll/ܽᩴ֫;

    move-result-object p1

    iget-object p1, p1, Ll/ܽᩴ֫;->֫:Landroid/media/AudioAttributes;

    .line 109
    invoke-static {p2, p1, v2}, Ll/۟۫֫;->֫(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;Z)Ll/ܺ۫֫;

    move-result-object p1

    return-object p1

    .line 100
    :catch_0
    sget-object p1, Ll/ܺ۫֫;->ᩳ:Ll/ܺ۫֫;

    return-object p1

    .line 88
    :cond_7
    :goto_3
    sget-object p1, Ll/ܺ۫֫;->ᩳ:Ll/ܺ۫֫;

    return-object p1

    .line 76
    :cond_8
    :goto_4
    sget-object p1, Ll/ܺ۫֫;->ᩳ:Ll/ܺ۫֫;

    return-object p1
.end method
