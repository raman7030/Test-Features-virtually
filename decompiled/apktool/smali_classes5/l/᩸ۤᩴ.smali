.class public final Ll/᩸ۤᩴ;
.super Ll/֡ۤᩴ;
.source "N673"


# static fields
.field public static final h:Ll/ᩳ᩹ᩴ;

.field public static final i:J


# instance fields
.field public e:Ll/᩹ۤᩴ;

.field public volatile f:Ll/᩹ۤᩴ;

.field public volatile g:Ljava/lang/Thread;

.field public volatile lockState:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 2767
    const-class v0, Ll/ۧۤᩴ;

    .line 114
    sget-object v0, Ll/ᩳ᩹ᩴ;->b:Ll/ᩳ᩹ᩴ;

    .line 3292
    sput-object v0, Ll/᩸ۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    .line 3293
    const-class v1, Ll/᩸ۤᩴ;

    const-string v2, "lockState"

    .line 3294
    invoke-virtual {v0, v1, v2}, Ll/ᩳ᩹ᩴ;->h(Ljava/lang/Class;Ljava/lang/String;)J

    move-result-wide v0

    sput-wide v0, Ll/᩸ۤᩴ;->i:J

    return-void
.end method

.method public constructor <init>(Ll/᩹ۤᩴ;)V
    .locals 9

    const/4 v0, -0x2

    const/4 v1, 0x0

    .line 2798
    invoke-direct {p0, v0, v1, v1}, Ll/֡ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 2799
    iput-object p1, p0, Ll/᩸ۤᩴ;->f:Ll/᩹ۤᩴ;

    move-object v0, v1

    :goto_0
    if-eqz p1, :cond_b

    .line 2802
    iget-object v2, p1, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    check-cast v2, Ll/᩹ۤᩴ;

    .line 2803
    iput-object v1, p1, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    iput-object v1, p1, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    .line 2805
    iput-object v1, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    .line 2806
    iput-boolean v3, p1, Ll/᩹ۤᩴ;->i:Z

    :goto_1
    move-object v0, p1

    goto :goto_8

    .line 2810
    :cond_0
    iget-object v3, p1, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    .line 2811
    iget v4, p1, Ll/֡ۤᩴ;->a:I

    move-object v5, v0

    move-object v6, v1

    .line 2815
    :goto_2
    iget-object v7, v5, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    .line 2816
    iget v8, v5, Ll/֡ۤᩴ;->a:I

    if-le v8, v4, :cond_1

    const/4 v7, -0x1

    goto :goto_5

    :cond_1
    if-ge v8, v4, :cond_2

    const/4 v7, 0x1

    goto :goto_5

    :cond_2
    if-nez v6, :cond_3

    .line 2821
    invoke-static {v3}, Ll/ۧۤᩴ;->c(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v6

    if-eqz v6, :cond_6

    .line 2822
    :cond_3
    sget v8, Ll/ۧۤᩴ;->g:I

    if-eqz v7, :cond_5

    .line 738
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    if-eq v8, v6, :cond_4

    goto :goto_3

    .line 739
    :cond_4
    move-object v8, v3

    check-cast v8, Ljava/lang/Comparable;

    invoke-interface {v8, v7}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v8

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v8, 0x0

    :goto_4
    if-nez v8, :cond_7

    .line 2823
    :cond_6
    invoke-static {v3, v7}, Ll/᩸ۤᩴ;->i(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v7

    goto :goto_5

    :cond_7
    move v7, v8

    :goto_5
    if-gtz v7, :cond_8

    .line 2825
    iget-object v8, v5, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    goto :goto_6

    :cond_8
    iget-object v8, v5, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    :goto_6
    if-nez v8, :cond_a

    .line 2826
    iput-object v5, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-gtz v7, :cond_9

    .line 2828
    iput-object p1, v5, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    goto :goto_7

    .line 2830
    :cond_9
    iput-object p1, v5, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    .line 2831
    :goto_7
    invoke-static {v0, p1}, Ll/᩸ۤᩴ;->c(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;

    move-result-object p1

    goto :goto_1

    :goto_8
    move-object p1, v2

    goto :goto_0

    :cond_a
    move-object v5, v8

    goto :goto_2

    .line 2837
    :cond_b
    iput-object v0, p0, Ll/᩸ۤᩴ;->e:Ll/᩹ۤᩴ;

    return-void
.end method

.method public static b(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;
    .locals 8

    :goto_0
    if-eqz p1, :cond_1d

    if-ne p1, p0, :cond_0

    goto/16 :goto_b

    .line 3180
    :cond_0
    iget-object v0, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 3181
    iput-boolean v1, p1, Ll/᩹ۤᩴ;->i:Z

    return-object p1

    .line 3184
    :cond_1
    iget-boolean v2, p1, Ll/᩹ۤᩴ;->i:Z

    if-eqz v2, :cond_2

    .line 3185
    iput-boolean v1, p1, Ll/᩹ۤᩴ;->i:Z

    return-object p0

    .line 3188
    :cond_2
    iget-object v2, v0, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, p1, :cond_f

    .line 3189
    iget-object v2, v0, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    if-eqz v2, :cond_4

    iget-boolean v5, v2, Ll/᩹ۤᩴ;->i:Z

    if-eqz v5, :cond_4

    .line 3190
    iput-boolean v1, v2, Ll/᩹ۤᩴ;->i:Z

    .line 3191
    iput-boolean v4, v0, Ll/᩹ۤᩴ;->i:Z

    .line 3192
    invoke-static {p0, v0}, Ll/᩸ۤᩴ;->g(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;

    move-result-object p0

    .line 3193
    iget-object v0, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-nez v0, :cond_3

    move-object v2, v3

    goto :goto_1

    :cond_3
    iget-object v2, v0, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    :cond_4
    :goto_1
    if-nez v2, :cond_5

    goto :goto_5

    .line 3198
    :cond_5
    iget-object v5, v2, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    iget-object v6, v2, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    if-eqz v6, :cond_6

    .line 3199
    iget-boolean v7, v6, Ll/᩹ۤᩴ;->i:Z

    if-nez v7, :cond_7

    :cond_6
    if-eqz v5, :cond_e

    iget-boolean v7, v5, Ll/᩹ۤᩴ;->i:Z

    if-nez v7, :cond_7

    goto :goto_4

    :cond_7
    if-eqz v6, :cond_8

    .line 3205
    iget-boolean v6, v6, Ll/᩹ۤᩴ;->i:Z

    if-nez v6, :cond_b

    :cond_8
    if-eqz v5, :cond_9

    .line 3207
    iput-boolean v1, v5, Ll/᩹ۤᩴ;->i:Z

    .line 3208
    :cond_9
    iput-boolean v4, v2, Ll/᩹ۤᩴ;->i:Z

    .line 3209
    invoke-static {p0, v2}, Ll/᩸ۤᩴ;->h(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;

    move-result-object p0

    .line 3210
    iget-object v0, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-nez v0, :cond_a

    goto :goto_2

    .line 3211
    :cond_a
    iget-object v3, v0, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    :goto_2
    move-object v2, v3

    :cond_b
    if-eqz v2, :cond_d

    if-nez v0, :cond_c

    const/4 p1, 0x0

    goto :goto_3

    .line 3214
    :cond_c
    iget-boolean p1, v0, Ll/᩹ۤᩴ;->i:Z

    :goto_3
    iput-boolean p1, v2, Ll/᩹ۤᩴ;->i:Z

    .line 3215
    iget-object p1, v2, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    if-eqz p1, :cond_d

    .line 3216
    iput-boolean v1, p1, Ll/᩹ۤᩴ;->i:Z

    :cond_d
    if-eqz v0, :cond_1b

    .line 3219
    iput-boolean v1, v0, Ll/᩹ۤᩴ;->i:Z

    .line 3220
    invoke-static {p0, v0}, Ll/᩸ۤᩴ;->g(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;

    move-result-object p0

    goto/16 :goto_9

    .line 3201
    :cond_e
    :goto_4
    iput-boolean v4, v2, Ll/᩹ۤᩴ;->i:Z

    :goto_5
    move-object p1, v0

    goto :goto_0

    :cond_f
    if-eqz v2, :cond_11

    .line 3227
    iget-boolean v5, v2, Ll/᩹ۤᩴ;->i:Z

    if-eqz v5, :cond_11

    .line 3228
    iput-boolean v1, v2, Ll/᩹ۤᩴ;->i:Z

    .line 3229
    iput-boolean v4, v0, Ll/᩹ۤᩴ;->i:Z

    .line 3230
    invoke-static {p0, v0}, Ll/᩸ۤᩴ;->h(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;

    move-result-object p0

    .line 3231
    iget-object v0, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-nez v0, :cond_10

    move-object v2, v3

    goto :goto_6

    :cond_10
    iget-object v2, v0, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    :cond_11
    :goto_6
    if-nez v2, :cond_12

    goto :goto_5

    .line 3236
    :cond_12
    iget-object v5, v2, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    iget-object v6, v2, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    if-eqz v5, :cond_13

    .line 3237
    iget-boolean v7, v5, Ll/᩹ۤᩴ;->i:Z

    if-nez v7, :cond_14

    :cond_13
    if-eqz v6, :cond_1c

    iget-boolean v7, v6, Ll/᩹ۤᩴ;->i:Z

    if-nez v7, :cond_14

    goto :goto_a

    :cond_14
    if-eqz v5, :cond_15

    .line 3243
    iget-boolean v5, v5, Ll/᩹ۤᩴ;->i:Z

    if-nez v5, :cond_18

    :cond_15
    if-eqz v6, :cond_16

    .line 3245
    iput-boolean v1, v6, Ll/᩹ۤᩴ;->i:Z

    .line 3246
    :cond_16
    iput-boolean v4, v2, Ll/᩹ۤᩴ;->i:Z

    .line 3247
    invoke-static {p0, v2}, Ll/᩸ۤᩴ;->g(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;

    move-result-object p0

    .line 3248
    iget-object v0, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-nez v0, :cond_17

    goto :goto_7

    .line 3249
    :cond_17
    iget-object v3, v0, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    :goto_7
    move-object v2, v3

    :cond_18
    if-eqz v2, :cond_1a

    if-nez v0, :cond_19

    const/4 p1, 0x0

    goto :goto_8

    .line 3252
    :cond_19
    iget-boolean p1, v0, Ll/᩹ۤᩴ;->i:Z

    :goto_8
    iput-boolean p1, v2, Ll/᩹ۤᩴ;->i:Z

    .line 3253
    iget-object p1, v2, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    if-eqz p1, :cond_1a

    .line 3254
    iput-boolean v1, p1, Ll/᩹ۤᩴ;->i:Z

    :cond_1a
    if-eqz v0, :cond_1b

    .line 3257
    iput-boolean v1, v0, Ll/᩹ۤᩴ;->i:Z

    .line 3258
    invoke-static {p0, v0}, Ll/᩸ۤᩴ;->h(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;

    move-result-object p0

    :cond_1b
    :goto_9
    move-object p1, p0

    move-object p0, p1

    goto/16 :goto_0

    .line 3239
    :cond_1c
    :goto_a
    iput-boolean v4, v2, Ll/᩹ۤᩴ;->i:Z

    goto :goto_5

    :cond_1d
    :goto_b
    return-object p0
.end method

.method public static c(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;
    .locals 8

    const/4 v0, 0x1

    .line 3122
    iput-boolean v0, p1, Ll/᩹ۤᩴ;->i:Z

    .line 3124
    :cond_0
    :goto_0
    iget-object v1, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 3125
    iput-boolean v2, p1, Ll/᩹ۤᩴ;->i:Z

    return-object p1

    .line 3128
    :cond_1
    iget-boolean v3, v1, Ll/᩹ۤᩴ;->i:Z

    if-eqz v3, :cond_a

    iget-object v3, v1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-nez v3, :cond_2

    goto/16 :goto_4

    .line 3130
    :cond_2
    iget-object v4, v3, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    const/4 v5, 0x0

    if-ne v1, v4, :cond_6

    .line 3131
    iget-object v4, v3, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    if-eqz v4, :cond_3

    iget-boolean v6, v4, Ll/᩹ۤᩴ;->i:Z

    if-eqz v6, :cond_3

    .line 3132
    iput-boolean v2, v4, Ll/᩹ۤᩴ;->i:Z

    .line 3133
    iput-boolean v2, v1, Ll/᩹ۤᩴ;->i:Z

    .line 3134
    iput-boolean v0, v3, Ll/᩹ۤᩴ;->i:Z

    goto :goto_2

    .line 3138
    :cond_3
    iget-object v4, v1, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    if-ne p1, v4, :cond_5

    .line 3139
    invoke-static {p0, v1}, Ll/᩸ۤᩴ;->g(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;

    move-result-object p0

    .line 3140
    iget-object p1, v1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-nez p1, :cond_4

    move-object v3, v5

    goto :goto_1

    :cond_4
    iget-object v3, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    :goto_1
    move-object v7, v1

    move-object v1, p1

    move-object p1, v7

    :cond_5
    if-eqz v1, :cond_0

    .line 3143
    iput-boolean v2, v1, Ll/᩹ۤᩴ;->i:Z

    if-eqz v3, :cond_0

    .line 3145
    iput-boolean v0, v3, Ll/᩹ۤᩴ;->i:Z

    .line 3146
    invoke-static {p0, v3}, Ll/᩸ۤᩴ;->h(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;

    move-result-object p0

    goto :goto_0

    :cond_6
    if-eqz v4, :cond_7

    .line 3152
    iget-boolean v6, v4, Ll/᩹ۤᩴ;->i:Z

    if-eqz v6, :cond_7

    .line 3153
    iput-boolean v2, v4, Ll/᩹ۤᩴ;->i:Z

    .line 3154
    iput-boolean v2, v1, Ll/᩹ۤᩴ;->i:Z

    .line 3155
    iput-boolean v0, v3, Ll/᩹ۤᩴ;->i:Z

    :goto_2
    move-object p1, v3

    goto :goto_0

    .line 3159
    :cond_7
    iget-object v4, v1, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    if-ne p1, v4, :cond_9

    .line 3160
    invoke-static {p0, v1}, Ll/᩸ۤᩴ;->h(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;

    move-result-object p0

    .line 3161
    iget-object p1, v1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-nez p1, :cond_8

    move-object v3, v5

    goto :goto_3

    :cond_8
    iget-object v3, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    :goto_3
    move-object v7, v1

    move-object v1, p1

    move-object p1, v7

    :cond_9
    if-eqz v1, :cond_0

    .line 3164
    iput-boolean v2, v1, Ll/᩹ۤᩴ;->i:Z

    if-eqz v3, :cond_0

    .line 3166
    iput-boolean v0, v3, Ll/᩹ۤᩴ;->i:Z

    .line 3167
    invoke-static {p0, v3}, Ll/᩸ۤᩴ;->g(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;

    move-result-object p0

    goto :goto_0

    :cond_a
    :goto_4
    return-object p0
.end method

.method public static g(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;
    .locals 3

    if-eqz p1, :cond_3

    .line 3087
    iget-object v0, p1, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    if-eqz v0, :cond_3

    .line 3088
    iget-object v1, v0, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    iput-object v1, p1, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    if-eqz v1, :cond_0

    .line 3089
    iput-object p1, v1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    .line 3090
    :cond_0
    iget-object v1, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    iput-object v1, v0, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-nez v1, :cond_1

    const/4 p0, 0x0

    .line 3091
    iput-boolean p0, v0, Ll/᩹ۤᩴ;->i:Z

    move-object p0, v0

    goto :goto_0

    .line 3092
    :cond_1
    iget-object v2, v1, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    if-ne v2, p1, :cond_2

    .line 3093
    iput-object v0, v1, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    goto :goto_0

    .line 3095
    :cond_2
    iput-object v0, v1, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    .line 3096
    :goto_0
    iput-object p1, v0, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    .line 3097
    iput-object v0, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    :cond_3
    return-object p0
.end method

.method public static h(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;
    .locals 3

    if-eqz p1, :cond_3

    .line 3105
    iget-object v0, p1, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    if-eqz v0, :cond_3

    .line 3106
    iget-object v1, v0, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    iput-object v1, p1, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    if-eqz v1, :cond_0

    .line 3107
    iput-object p1, v1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    .line 3108
    :cond_0
    iget-object v1, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    iput-object v1, v0, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-nez v1, :cond_1

    const/4 p0, 0x0

    .line 3109
    iput-boolean p0, v0, Ll/᩹ۤᩴ;->i:Z

    move-object p0, v0

    goto :goto_0

    .line 3110
    :cond_1
    iget-object v2, v1, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    if-ne v2, p1, :cond_2

    .line 3111
    iput-object v0, v1, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    goto :goto_0

    .line 3113
    :cond_2
    iput-object v0, v1, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    .line 3114
    :goto_0
    iput-object p1, v0, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    .line 3115
    iput-object v0, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    :cond_3
    return-object p0
.end method

.method public static i(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    .line 2787
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 2788
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return v0

    .line 2789
    :cond_1
    :goto_0
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    if-gt p0, p1, :cond_2

    const/4 p0, -0x1

    return p0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)Ll/֡ۤᩴ;
    .locals 11

    .line 2887
    iget-object v0, p0, Ll/᩸ۤᩴ;->f:Ll/᩹ۤᩴ;

    :cond_0
    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_7

    .line 2889
    iget v6, p0, Ll/᩸ۤᩴ;->lockState:I

    and-int/lit8 v2, v6, 0x3

    if-eqz v2, :cond_3

    .line 2890
    iget v1, v0, Ll/֡ۤᩴ;->a:I

    if-ne v1, p1, :cond_2

    iget-object v1, v0, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    if-eq v1, p2, :cond_1

    if-eqz v1, :cond_2

    .line 2891
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    return-object v0

    .line 2893
    :cond_2
    iget-object v0, v0, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    goto :goto_0

    .line 2895
    :cond_3
    sget-object v8, Ll/᩸ۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v9, Ll/᩸ۤᩴ;->i:J

    add-int/lit8 v7, v6, 0x4

    move-object v2, v8

    move-object v3, p0

    move-wide v4, v9

    invoke-virtual/range {v2 .. v7}, Ll/ᩳ᩹ᩴ;->c(Ljava/lang/Object;JII)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x6

    .line 2899
    :try_start_0
    iget-object v2, p0, Ll/᩸ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-nez v2, :cond_4

    goto :goto_1

    .line 2900
    :cond_4
    invoke-virtual {v2, p1, p2, v1}, Ll/᩹ۤᩴ;->b(ILjava/lang/Object;Ljava/lang/Class;)Ll/᩹ۤᩴ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2903
    :goto_1
    invoke-virtual {v8, p0, v9, v10}, Ll/ᩳ᩹ᩴ;->e(Ll/᩸ۤᩴ;J)I

    move-result p1

    if-ne p1, v0, :cond_5

    iget-object p1, p0, Ll/᩸ۤᩴ;->g:Ljava/lang/Thread;

    if-eqz p1, :cond_5

    .line 2905
    invoke-static {p1}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_5
    return-object v1

    :catchall_0
    move-exception p1

    .line 2903
    sget-object p2, Ll/᩸ۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v1, Ll/᩸ۤᩴ;->i:J

    invoke-virtual {p2, p0, v1, v2}, Ll/ᩳ᩹ᩴ;->e(Ll/᩸ۤᩴ;J)I

    move-result p2

    if-ne p2, v0, :cond_6

    iget-object p2, p0, Ll/᩸ۤᩴ;->g:Ljava/lang/Thread;

    if-eqz p2, :cond_6

    .line 2905
    invoke-static {p2}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 2906
    :cond_6
    throw p1

    :cond_7
    return-object v1
.end method

.method public final d()V
    .locals 7

    .line 2845
    sget-object v0, Ll/᩸ۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v2, Ll/᩸ۤᩴ;->i:J

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ll/ᩳ᩹ᩴ;->c(Ljava/lang/Object;JII)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    .line 2862
    :cond_0
    :goto_0
    iget v5, p0, Ll/᩸ۤᩴ;->lockState:I

    and-int/lit8 v1, v5, -0x3

    if-nez v1, :cond_1

    .line 2863
    sget-object v1, Ll/᩸ۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v3, Ll/᩸ۤᩴ;->i:J

    const/4 v6, 0x1

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ll/ᩳ᩹ᩴ;->c(Ljava/lang/Object;JII)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 2865
    iput-object v0, p0, Ll/᩸ۤᩴ;->g:Ljava/lang/Thread;

    return-void

    :cond_1
    and-int/lit8 v1, v5, 0x2

    if-nez v1, :cond_2

    .line 2870
    sget-object v1, Ll/᩸ۤᩴ;->h:Ll/ᩳ᩹ᩴ;

    sget-wide v3, Ll/᩸ۤᩴ;->i:J

    or-int/lit8 v6, v5, 0x2

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ll/ᩳ᩹ᩴ;->c(Ljava/lang/Object;JII)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2872
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ۤᩴ;->g:Ljava/lang/Thread;

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_0

    .line 2876
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->park(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final e(ILjava/lang/Object;Ljava/lang/Object;)Ll/᩹ۤᩴ;
    .locals 15

    move-object v1, p0

    move/from16 v0, p1

    move-object/from16 v4, p2

    .line 2921
    iget-object v2, v1, Ll/᩸ۤᩴ;->e:Ll/᩹ۤᩴ;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v3, 0x0

    move-object v10, v2

    move-object v2, v8

    :goto_0
    if-nez v10, :cond_0

    .line 2924
    new-instance v9, Ll/᩹ۤᩴ;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v9

    move/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    invoke-direct/range {v2 .. v7}, Ll/᩹ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ll/֡ۤᩴ;Ll/᩹ۤᩴ;)V

    iput-object v9, v1, Ll/᩸ۤᩴ;->e:Ll/᩹ۤᩴ;

    iput-object v9, v1, Ll/᩸ۤᩴ;->f:Ll/᩹ۤᩴ;

    return-object v8

    .line 2927
    :cond_0
    iget v5, v10, Ll/֡ۤᩴ;->a:I

    const/4 v11, 0x1

    if-le v5, v0, :cond_1

    const/4 v5, -0x1

    const/4 v12, -0x1

    goto :goto_4

    :cond_1
    if-ge v5, v0, :cond_2

    const/4 v5, 0x1

    const/4 v12, 0x1

    goto :goto_4

    .line 2931
    :cond_2
    iget-object v5, v10, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    if-eq v5, v4, :cond_12

    if-eqz v5, :cond_3

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_7

    :cond_3
    if-nez v2, :cond_4

    .line 2934
    invoke-static/range {p2 .. p2}, Ll/ۧۤᩴ;->c(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 2935
    :cond_4
    sget v6, Ll/ۧۤᩴ;->g:I

    if-eqz v5, :cond_6

    .line 738
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    if-eq v6, v2, :cond_5

    goto :goto_1

    .line 739
    :cond_5
    move-object v6, v4

    check-cast v6, Ljava/lang/Comparable;

    invoke-interface {v6, v5}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v6

    goto :goto_2

    :cond_6
    :goto_1
    const/4 v6, 0x0

    :goto_2
    if-nez v6, :cond_c

    :cond_7
    if-nez v3, :cond_b

    .line 2939
    iget-object v3, v10, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    if-eqz v3, :cond_9

    .line 2940
    invoke-virtual {v3, v0, v4, v2}, Ll/᩹ۤᩴ;->b(ILjava/lang/Object;Ljava/lang/Class;)Ll/᩹ۤᩴ;

    move-result-object v3

    if-nez v3, :cond_8

    goto :goto_3

    :cond_8
    return-object v3

    :cond_9
    :goto_3
    iget-object v3, v10, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    if-eqz v3, :cond_a

    .line 2942
    invoke-virtual {v3, v0, v4, v2}, Ll/᩹ۤᩴ;->b(ILjava/lang/Object;Ljava/lang/Class;)Ll/᩹ۤᩴ;

    move-result-object v3

    if-eqz v3, :cond_a

    return-object v3

    :cond_a
    const/4 v3, 0x1

    .line 2945
    :cond_b
    invoke-static {v4, v5}, Ll/᩸ۤᩴ;->i(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v5

    move v12, v5

    goto :goto_4

    :cond_c
    move v12, v6

    :goto_4
    if-gtz v12, :cond_d

    .line 2949
    iget-object v5, v10, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    goto :goto_5

    :cond_d
    iget-object v5, v10, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    :goto_5
    if-nez v5, :cond_11

    .line 2950
    iget-object v13, v1, Ll/᩸ۤᩴ;->f:Ll/᩹ۤᩴ;

    .line 2951
    new-instance v14, Ll/᩹ۤᩴ;

    move-object v2, v14

    move/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object v6, v13

    move-object v7, v10

    invoke-direct/range {v2 .. v7}, Ll/᩹ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ll/֡ۤᩴ;Ll/᩹ۤᩴ;)V

    iput-object v14, v1, Ll/᩸ۤᩴ;->f:Ll/᩹ۤᩴ;

    if-eqz v13, :cond_e

    .line 2953
    iput-object v14, v13, Ll/᩹ۤᩴ;->h:Ll/᩹ۤᩴ;

    :cond_e
    if-gtz v12, :cond_f

    .line 2955
    iput-object v14, v10, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    goto :goto_6

    .line 2957
    :cond_f
    iput-object v14, v10, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    .line 2958
    :goto_6
    iget-boolean v0, v10, Ll/᩹ۤᩴ;->i:Z

    if-nez v0, :cond_10

    .line 2959
    iput-boolean v11, v14, Ll/᩹ۤᩴ;->i:Z

    return-object v8

    .line 2961
    :cond_10
    invoke-virtual {p0}, Ll/᩸ۤᩴ;->d()V

    .line 2963
    :try_start_0
    iget-object v0, v1, Ll/᩸ۤᩴ;->e:Ll/᩹ۤᩴ;

    invoke-static {v0, v14}, Ll/᩸ۤᩴ;->c(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;

    move-result-object v0

    iput-object v0, v1, Ll/᩸ۤᩴ;->e:Ll/᩹ۤᩴ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2853
    iput v9, v1, Ll/᩸ۤᩴ;->lockState:I

    return-object v8

    :catchall_0
    move-exception v0

    iput v9, v1, Ll/᩸ۤᩴ;->lockState:I

    .line 2966
    throw v0

    :cond_11
    move-object v10, v5

    goto/16 :goto_0

    :cond_12
    :goto_7
    return-object v10
.end method

.method public final f(Ll/᩹ۤᩴ;)Z
    .locals 10

    .line 2986
    iget-object v0, p1, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    check-cast v0, Ll/᩹ۤᩴ;

    .line 2987
    iget-object v1, p1, Ll/᩹ۤᩴ;->h:Ll/᩹ۤᩴ;

    if-nez v1, :cond_0

    .line 2990
    iput-object v0, p0, Ll/᩸ۤᩴ;->f:Ll/᩹ۤᩴ;

    goto :goto_0

    .line 2992
    :cond_0
    iput-object v0, v1, Ll/֡ۤᩴ;->d:Ll/֡ۤᩴ;

    :goto_0
    if-eqz v0, :cond_1

    .line 2994
    iput-object v1, v0, Ll/᩹ۤᩴ;->h:Ll/᩹ۤᩴ;

    .line 2995
    :cond_1
    iget-object v0, p0, Ll/᩸ۤᩴ;->f:Ll/᩹ۤᩴ;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_2

    .line 2996
    iput-object v2, p0, Ll/᩸ۤᩴ;->e:Ll/᩹ۤᩴ;

    return v1

    .line 2999
    :cond_2
    iget-object v0, p0, Ll/᩸ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-eqz v0, :cond_15

    iget-object v3, v0, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    if-eqz v3, :cond_15

    iget-object v3, v0, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    if-eqz v3, :cond_15

    iget-object v3, v3, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    if-nez v3, :cond_3

    goto/16 :goto_9

    .line 3002
    :cond_3
    invoke-virtual {p0}, Ll/᩸ۤᩴ;->d()V

    const/4 v1, 0x0

    .line 3005
    :try_start_0
    iget-object v3, p1, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    .line 3006
    iget-object v4, p1, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    if-eqz v3, :cond_b

    if-eqz v4, :cond_b

    move-object v5, v4

    .line 3009
    :goto_1
    iget-object v6, v5, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    if-eqz v6, :cond_4

    move-object v5, v6

    goto :goto_1

    .line 3011
    :cond_4
    iget-boolean v6, v5, Ll/᩹ۤᩴ;->i:Z

    iget-boolean v7, p1, Ll/᩹ۤᩴ;->i:Z

    iput-boolean v7, v5, Ll/᩹ۤᩴ;->i:Z

    iput-boolean v6, p1, Ll/᩹ۤᩴ;->i:Z

    .line 3012
    iget-object v6, v5, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    .line 3013
    iget-object v7, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-ne v5, v4, :cond_5

    .line 3015
    iput-object v5, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    .line 3016
    iput-object p1, v5, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    goto :goto_3

    .line 3019
    :cond_5
    iget-object v8, v5, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    .line 3020
    iput-object v8, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-eqz v8, :cond_7

    .line 3021
    iget-object v9, v8, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    if-ne v5, v9, :cond_6

    .line 3022
    iput-object p1, v8, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    goto :goto_2

    .line 3024
    :cond_6
    iput-object p1, v8, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    .line 3026
    :cond_7
    :goto_2
    iput-object v4, v5, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    .line 3027
    iput-object v5, v4, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    .line 3029
    :goto_3
    iput-object v2, p1, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    .line 3030
    iput-object v6, p1, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    if-eqz v6, :cond_8

    .line 3031
    iput-object p1, v6, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    .line 3032
    :cond_8
    iput-object v3, v5, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    .line 3033
    iput-object v5, v3, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    .line 3034
    iput-object v7, v5, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-nez v7, :cond_9

    move-object v0, v5

    goto :goto_4

    .line 3036
    :cond_9
    iget-object v3, v7, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    if-ne p1, v3, :cond_a

    .line 3037
    iput-object v5, v7, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    goto :goto_4

    .line 3039
    :cond_a
    iput-object v5, v7, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    :goto_4
    if-eqz v6, :cond_d

    move-object v3, v6

    goto :goto_5

    :cond_b
    if-eqz v3, :cond_c

    goto :goto_5

    :cond_c
    if-eqz v4, :cond_d

    move-object v3, v4

    goto :goto_5

    :cond_d
    move-object v3, p1

    :goto_5
    if-eq v3, p1, :cond_10

    .line 3052
    iget-object v4, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    iput-object v4, v3, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-nez v4, :cond_e

    move-object v0, v3

    goto :goto_6

    .line 3055
    :cond_e
    iget-object v5, v4, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    if-ne p1, v5, :cond_f

    .line 3056
    iput-object v3, v4, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    goto :goto_6

    .line 3058
    :cond_f
    iput-object v3, v4, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    .line 3059
    :goto_6
    iput-object v2, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    iput-object v2, p1, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    iput-object v2, p1, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    .line 3062
    :cond_10
    iget-boolean v4, p1, Ll/᩹ۤᩴ;->i:Z

    if-eqz v4, :cond_11

    goto :goto_7

    :cond_11
    invoke-static {v0, v3}, Ll/᩸ۤᩴ;->b(Ll/᩹ۤᩴ;Ll/᩹ۤᩴ;)Ll/᩹ۤᩴ;

    move-result-object v0

    :goto_7
    iput-object v0, p0, Ll/᩸ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-ne p1, v3, :cond_14

    .line 3066
    iget-object v0, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    if-eqz v0, :cond_14

    .line 3067
    iget-object v3, v0, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    if-ne p1, v3, :cond_12

    .line 3068
    iput-object v2, v0, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    goto :goto_8

    .line 3069
    :cond_12
    iget-object v3, v0, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    if-ne p1, v3, :cond_13

    .line 3070
    iput-object v2, v0, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    .line 3071
    :cond_13
    :goto_8
    iput-object v2, p1, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2853
    :cond_14
    iput v1, p0, Ll/᩸ۤᩴ;->lockState:I

    return v1

    :catchall_0
    move-exception p1

    iput v1, p0, Ll/᩸ۤᩴ;->lockState:I

    .line 3076
    throw p1

    :cond_15
    :goto_9
    return v1
.end method
