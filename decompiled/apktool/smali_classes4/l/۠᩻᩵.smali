.class public final Ll/۠᩻᩵;
.super Ll/֨᩻᩵;
.source "I6PU"


# instance fields
.field public ܰ:Ll/᩸ۜ᩵;


# virtual methods
.method public final ֫(I)Ll/ۗ᩻᩵;
    .locals 6

    .line 1129
    iget-object v0, p0, Ll/֨᩻᩵;->᩺:Ll/ۗ᩻᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    iget-object v2, v0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz v2, :cond_6

    iget-object v3, p0, Ll/֨᩻᩵;->ۛ:Ll/ۗ᩻᩵;

    if-eqz v3, :cond_6

    iget-object v4, p0, Ll/۠᩻᩵;->ܰ:Ll/᩸ۜ᩵;

    if-nez v4, :cond_0

    goto :goto_1

    .line 1132
    :cond_0
    iget-object v5, v3, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-nez v5, :cond_5

    .line 1133
    instance-of v5, v2, Ll/᩻᩻᩵;

    if-eqz v5, :cond_2

    .line 1134
    move-object v5, v2

    check-cast v5, Ll/᩻᩻᩵;

    iget-object v5, v5, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-eqz v5, :cond_1

    .line 1135
    invoke-virtual {v3, v2, v5}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    move-object v2, v1

    :cond_2
    if-gtz p1, :cond_3

    .line 1141
    :try_start_0
    invoke-virtual {p0}, Ll/֨᩻᩵;->ۜ()Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_1

    .line 1144
    :cond_3
    invoke-interface {v4, v2}, Ll/᩸ۜ᩵;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫᩻᩵;

    invoke-interface {v2}, Ll/۫᩻᩵;->֫()Ll/ۗ᩻᩵;

    move-result-object v2

    .line 1145
    iget-object v4, v2, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz v4, :cond_4

    .line 1146
    invoke-virtual {v3, v4}, Ll/ۗ᩻᩵;->ۧ(Ljava/lang/Object;)V

    goto :goto_0

    .line 1148
    :cond_4
    new-instance v4, Ll/᩹᩻᩵;

    .line 1083
    invoke-direct {v4, v1, v3, v2}, Ll/֨᩻᩵;-><init>(Ljava/util/concurrent/Executor;Ll/ۗ᩻᩵;Ll/ۗ᩻᩵;)V

    .line 1148
    invoke-virtual {v2, v4}, Ll/ۗ᩻᩵;->ۧ(Ll/ۘ᩻᩵;)V

    .line 1149
    iget-object v2, v3, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_5

    goto :goto_1

    :catchall_0
    move-exception v2

    .line 1153
    invoke-virtual {v3, v2}, Ll/ۗ᩻᩵;->ۧ(Ljava/lang/Throwable;)V

    .line 1156
    :cond_5
    :goto_0
    iput-object v1, p0, Ll/֨᩻᩵;->᩺:Ll/ۗ᩻᩵;

    iput-object v1, p0, Ll/֨᩻᩵;->ۛ:Ll/ۗ᩻᩵;

    iput-object v1, p0, Ll/۠᩻᩵;->ܰ:Ll/᩸ۜ᩵;

    .line 1157
    invoke-virtual {v3, v0, p1}, Ll/ۗ᩻᩵;->֫(Ll/ۗ᩻᩵;I)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_1
    return-object v1
.end method
