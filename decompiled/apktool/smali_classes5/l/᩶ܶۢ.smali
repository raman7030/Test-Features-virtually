.class public abstract Ll/᩶ܶۢ;
.super Ll/ۘ۠ۢ;
.source "NAJ1"


# static fields
.field public static final synthetic ۙ֫:I


# instance fields
.field public ֡֫:J

.field public ֨֫:J

.field public ۖ֫:Z

.field public final ۘ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ۚ֫:I

.field public ۠֫:Z

.field public ۡ֫:Ljava/lang/CharSequence;

.field public final ܶ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ܺ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ᩴ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ᩵֫:I

.field public ᩶֫:Ljava/lang/CharSequence;

.field public ᩸֫:J

.field public final ᩹֫:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ll/ۘ۠ۢ;-><init>()V

    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Ll/᩶ܶۢ;->ۖ֫:Z

    .line 26
    iput-boolean v0, p0, Ll/᩶ܶۢ;->۠֫:Z

    .line 27
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/᩶ܶۢ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/᩶ܶۢ;->᩹֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/᩶ܶۢ;->ۘ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 30
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/᩶ܶۢ;->ܶ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/᩶ܶۢ;->ܺ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static ֫(Ll/᩶ܶۢ;Ll/֫۬ܿ;)V
    .locals 5

    .line 54
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩸֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ᩴ֫()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/֫۬ܿ;->ܿ(Ljava/lang/CharSequence;)V

    .line 57
    :cond_0
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ܶ֫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 153
    iget-boolean v0, p0, Ll/᩶ܶۢ;->ۖ֫:Z

    if-eqz v0, :cond_1

    .line 59
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۜ֫()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/֫۬ܿ;->ۧ(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۜ֫()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/֫۬ܿ;->ܽ(Ljava/lang/CharSequence;)V

    .line 104
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/᩶ܶۢ;->ܶ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 100
    iget-boolean v0, p0, Ll/᩶ܶۢ;->۠֫:Z

    .line 65
    invoke-virtual {p1, v0}, Ll/֫۬ܿ;->֫(Z)V

    .line 129
    :cond_3
    iget-object v0, p0, Ll/᩶ܶۢ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 68
    invoke-virtual {p0}, Ll/᩶ܶۢ;->۫֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/֫۬ܿ;->ᩳ(Ljava/lang/CharSequence;)V

    .line 143
    :cond_4
    iget-object v0, p0, Ll/᩶ܶۢ;->᩹֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 139
    iget-wide v3, p0, Ll/᩶ܶۢ;->᩸֫:J

    .line 71
    invoke-virtual {p1, v3, v4}, Ll/֫۬ܿ;->֫(J)V

    .line 157
    :cond_5
    iget-object v0, p0, Ll/᩶ܶۢ;->ۘ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 153
    iget-boolean v0, p0, Ll/᩶ܶۢ;->ۖ֫:Z

    .line 228
    new-instance v3, Ll/ۨۗܿ;

    invoke-direct {v3, p1, v0}, Ll/ۨۗܿ;-><init>(Ll/֫۬ܿ;Z)V

    .line 241
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 242
    invoke-virtual {v3}, Ll/ۨۗܿ;->run()V

    goto :goto_1

    .line 244
    :cond_6
    invoke-static {v3}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 176
    :cond_7
    :goto_1
    iget-object v0, p0, Ll/᩶ܶۢ;->ܺ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 168
    iget-object v0, p0, Ll/᩶ܶۢ;->ۡ֫:Ljava/lang/CharSequence;

    .line 77
    invoke-virtual {p1, v0}, Ll/֫۬ܿ;->֫(Ljava/lang/CharSequence;)V

    .line 172
    iget-object v0, p0, Ll/᩶ܶۢ;->᩶֫:Ljava/lang/CharSequence;

    .line 78
    invoke-virtual {p1, v0}, Ll/֫۬ܿ;->ܳ(Ljava/lang/CharSequence;)V

    .line 80
    :cond_8
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۢ֫()I

    move-result p0

    invoke-virtual {p1, p0}, Ll/֫۬ܿ;->֫(I)V

    return-void
.end method


# virtual methods
.method public ֫(J)V
    .locals 0

    .line 133
    iput-wide p1, p0, Ll/᩶ܶۢ;->᩸֫:J

    .line 134
    iget-object p1, p0, Ll/᩶ܶۢ;->᩹֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 135
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩶֫()V

    return-void
.end method

.method public final ֫(Landroid/content/Intent;)V
    .locals 0

    .line 35
    invoke-super {p0, p1}, Ll/ۘ۠ۢ;->֫(Landroid/content/Intent;)V

    const-string p1, "ARG_MSG_FROM"

    .line 36
    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ܶۢ;->ۡ֫:Ljava/lang/CharSequence;

    const-string p1, "ARG_MSG_TO"

    .line 37
    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ܶۢ;->᩶֫:Ljava/lang/CharSequence;

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 161
    iput-object p1, p0, Ll/᩶ܶۢ;->ۡ֫:Ljava/lang/CharSequence;

    .line 162
    iput-object p2, p0, Ll/᩶ܶۢ;->᩶֫:Ljava/lang/CharSequence;

    .line 163
    iget-object p1, p0, Ll/᩶ܶۢ;->ܺ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 164
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩶֫()V

    return-void
.end method

.method public final ۙ֫()V
    .locals 2

    .line 181
    invoke-super {p0}, Ll/ۘ۠ۢ;->ۙ֫()V

    .line 182
    iget-object v0, p0, Ll/᩶ܶۢ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 183
    iget-object v0, p0, Ll/᩶ܶۢ;->᩹֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 184
    iget-object v0, p0, Ll/᩶ܶۢ;->ۘ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 185
    iget-object v0, p0, Ll/᩶ܶۢ;->ܶ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 186
    iget-object v0, p0, Ll/᩶ܶۢ;->ܺ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public final ۤ֫()J
    .locals 2

    .line 139
    iget-wide v0, p0, Ll/᩶ܶۢ;->᩸֫:J

    return-wide v0
.end method

.method public final ۧ(Ll/ۗܺ᩷;)Ll/֡ۚۢ;
    .locals 4

    .line 42
    new-instance v0, Ll/֫۬ܿ;

    invoke-direct {v0, p1}, Ll/֫۬ܿ;-><init>(Ll/ۗܺ᩷;)V

    .line 44
    new-instance p1, Ll/֨۫᩷;

    const/4 v1, 0x4

    invoke-direct {p1, v1, p0}, Ll/֨۫᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Ll/֫۬ܿ;->֫(Ll/֨۫᩷;)V

    .line 47
    new-instance p1, Ll/᩵֨᩷;

    invoke-direct {p1, v1, v0}, Ll/᩵֨᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Ll/֫۬ܿ;->֫(Ll/᩵֨᩷;)V

    .line 168
    iget-object p1, p0, Ll/᩶ܶۢ;->ۡ֫:Ljava/lang/CharSequence;

    .line 51
    invoke-virtual {v0, p1}, Ll/֫۬ܿ;->֫(Ljava/lang/CharSequence;)V

    .line 172
    iget-object p1, p0, Ll/᩶ܶۢ;->᩶֫:Ljava/lang/CharSequence;

    .line 52
    invoke-virtual {v0, p1}, Ll/֫۬ܿ;->ܳ(Ljava/lang/CharSequence;)V

    .line 53
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۚ()Ll/ۚۡ֫;

    move-result-object p1

    invoke-virtual {v0}, Ll/֫۬ܿ;->ܽ()Ll/֡ۚۢ;

    move-result-object v1

    new-instance v2, Ll/ᩳۘᩳ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p0, v0}, Ll/ᩳۘᩳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v1, v2}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 82
    invoke-virtual {v0}, Ll/֫۬ܿ;->ܳ()V

    invoke-virtual {v0}, Ll/֫۬ܿ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    return-object p1
.end method

.method public ۧ(Ljava/lang/CharSequence;)V
    .locals 0

    .line 86
    invoke-super {p0, p1}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۧ(Ll/᩷۫ܳ;)V
    .locals 2

    .line 108
    invoke-virtual {p1}, Ll/᩷۫ܳ;->᩻()I

    move-result v0

    iput v0, p0, Ll/᩶ܶۢ;->ۚ֫:I

    .line 109
    invoke-virtual {p1}, Ll/᩷۫ܳ;->ᩳ()I

    move-result v0

    iput v0, p0, Ll/᩶ܶۢ;->᩵֫:I

    .line 110
    invoke-virtual {p1}, Ll/᩷۫ܳ;->ۜ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩶ܶۢ;->֨֫:J

    .line 111
    invoke-virtual {p1}, Ll/᩷۫ܳ;->ܿ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩶ܶۢ;->֡֫:J

    .line 112
    iget-object p1, p0, Ll/᩶ܶۢ;->ᩴ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 113
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩶֫()V

    return-void
.end method

.method public ۫֫()Ljava/lang/String;
    .locals 8

    .line 117
    iget v0, p0, Ll/᩶ܶۢ;->ۚ֫:I

    .line 118
    iget-wide v1, p0, Ll/᩶ܶۢ;->֨֫:J

    .line 119
    iget-wide v3, p0, Ll/᩶ܶۢ;->֡֫:J

    sub-long v3, v1, v3

    const/4 v5, 0x1

    const-string v6, "/"

    if-ne v0, v5, :cond_0

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3, v4}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1, v2}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 123
    :cond_0
    iget v5, p0, Ll/᩶ܶۢ;->᩵֫:I

    .line 124
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sub-int/2addr v0, v5

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " ("

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3, v4}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1, v2}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Z)V
    .locals 1

    .line 147
    iput-boolean p1, p0, Ll/᩶ܶۢ;->ۖ֫:Z

    .line 148
    iget-object p1, p0, Ll/᩶ܶۢ;->ۘ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 149
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩶֫()V

    return-void
.end method

.method public final ᩳ(Z)V
    .locals 1

    .line 94
    iput-boolean p1, p0, Ll/᩶ܶۢ;->۠֫:Z

    .line 95
    iget-object p1, p0, Ll/᩶ܶۢ;->ܶ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 96
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩶֫()V

    return-void
.end method
