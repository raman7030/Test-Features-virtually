.class public Lcom/umeng/analytics/pro/an$a;
.super Lcom/umeng/analytics/pro/ce;
.source "O5QW"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 732
    invoke-direct {p0}, Lcom/umeng/analytics/pro/ce;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/analytics/pro/an$1;)V
    .locals 0

    .line 732
    invoke-direct {p0}, Lcom/umeng/analytics/pro/an$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/umeng/analytics/pro/bu;Lcom/umeng/analytics/pro/an;)V
    .locals 5

    .line 737
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->j()Lcom/umeng/analytics/pro/bz;

    .line 739
    :goto_0
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->l()Lcom/umeng/analytics/pro/bp;

    move-result-object v0

    .line 740
    iget-byte v1, v0, Lcom/umeng/analytics/pro/bp;->b:B

    if-nez v1, :cond_3

    .line 829
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->k()V

    .line 833
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/an;->m()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 837
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/an;->p()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 841
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/an;->s()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 845
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/an;->G()V

    return-void

    .line 842
    :cond_0
    new-instance p1, Lcom/umeng/analytics/pro/bv;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Required field \'length\' was not found in serialized data! Struct: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 843
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/bv;-><init>(Ljava/lang/String;)V

    throw p1

    .line 838
    :cond_1
    new-instance p1, Lcom/umeng/analytics/pro/bv;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Required field \'ts_secs\' was not found in serialized data! Struct: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 839
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/bv;-><init>(Ljava/lang/String;)V

    throw p1

    .line 834
    :cond_2
    new-instance p1, Lcom/umeng/analytics/pro/bv;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Required field \'serial_num\' was not found in serialized data! Struct: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 835
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/bv;-><init>(Ljava/lang/String;)V

    throw p1

    .line 743
    :cond_3
    iget-short v0, v0, Lcom/umeng/analytics/pro/bp;->c:S

    const/16 v2, 0x8

    const/16 v3, 0xb

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    .line 825
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    goto/16 :goto_1

    :pswitch_0
    if-ne v1, v2, :cond_4

    .line 818
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->w()I

    move-result v0

    iput v0, p2, Lcom/umeng/analytics/pro/an;->j:I

    .line 819
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/an;->j(Z)V

    goto/16 :goto_1

    .line 821
    :cond_4
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    goto/16 :goto_1

    :pswitch_1
    if-ne v1, v3, :cond_5

    .line 810
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->z()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/umeng/analytics/pro/an;->i:Ljava/lang/String;

    .line 811
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/an;->i(Z)V

    goto/16 :goto_1

    .line 813
    :cond_5
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    goto/16 :goto_1

    :pswitch_2
    if-ne v1, v3, :cond_6

    .line 802
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->z()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/umeng/analytics/pro/an;->h:Ljava/lang/String;

    .line 803
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/an;->h(Z)V

    goto/16 :goto_1

    .line 805
    :cond_6
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    goto/16 :goto_1

    :pswitch_3
    if-ne v1, v3, :cond_7

    .line 794
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->A()Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p2, Lcom/umeng/analytics/pro/an;->g:Ljava/nio/ByteBuffer;

    .line 795
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/an;->g(Z)V

    goto/16 :goto_1

    .line 797
    :cond_7
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    goto :goto_1

    :pswitch_4
    if-ne v1, v2, :cond_8

    .line 786
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->w()I

    move-result v0

    iput v0, p2, Lcom/umeng/analytics/pro/an;->f:I

    .line 787
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/an;->f(Z)V

    goto :goto_1

    .line 789
    :cond_8
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    goto :goto_1

    :pswitch_5
    if-ne v1, v2, :cond_9

    .line 778
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->w()I

    move-result v0

    iput v0, p2, Lcom/umeng/analytics/pro/an;->e:I

    .line 779
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/an;->e(Z)V

    goto :goto_1

    .line 781
    :cond_9
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    goto :goto_1

    :pswitch_6
    if-ne v1, v2, :cond_a

    .line 770
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->w()I

    move-result v0

    iput v0, p2, Lcom/umeng/analytics/pro/an;->d:I

    .line 771
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/an;->d(Z)V

    goto :goto_1

    .line 773
    :cond_a
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    goto :goto_1

    :pswitch_7
    if-ne v1, v3, :cond_b

    .line 762
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->z()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/umeng/analytics/pro/an;->c:Ljava/lang/String;

    .line 763
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/an;->c(Z)V

    goto :goto_1

    .line 765
    :cond_b
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    goto :goto_1

    :pswitch_8
    if-ne v1, v3, :cond_c

    .line 754
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->z()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/umeng/analytics/pro/an;->b:Ljava/lang/String;

    .line 755
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/an;->b(Z)V

    goto :goto_1

    .line 757
    :cond_c
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    goto :goto_1

    :pswitch_9
    if-ne v1, v3, :cond_d

    .line 746
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->z()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/umeng/analytics/pro/an;->a:Ljava/lang/String;

    .line 747
    invoke-virtual {p2, v4}, Lcom/umeng/analytics/pro/an;->a(Z)V

    goto :goto_1

    .line 749
    :cond_d
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/bx;->a(Lcom/umeng/analytics/pro/bu;B)V

    .line 827
    :goto_1
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->m()V

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic a(Lcom/umeng/analytics/pro/bu;Lcom/umeng/analytics/pro/av;)V
    .locals 0

    .line 732
    check-cast p2, Lcom/umeng/analytics/pro/an;

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/an$a;->b(Lcom/umeng/analytics/pro/bu;Lcom/umeng/analytics/pro/an;)V

    return-void
.end method

.method public b(Lcom/umeng/analytics/pro/bu;Lcom/umeng/analytics/pro/an;)V
    .locals 1

    .line 850
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/an;->G()V

    .line 852
    invoke-static {}, Lcom/umeng/analytics/pro/an;->H()Lcom/umeng/analytics/pro/bz;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bz;)V

    .line 853
    iget-object v0, p2, Lcom/umeng/analytics/pro/an;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 854
    invoke-static {}, Lcom/umeng/analytics/pro/an;->I()Lcom/umeng/analytics/pro/bp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bp;)V

    .line 855
    iget-object v0, p2, Lcom/umeng/analytics/pro/an;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Ljava/lang/String;)V

    .line 856
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->c()V

    .line 858
    :cond_0
    iget-object v0, p2, Lcom/umeng/analytics/pro/an;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 859
    invoke-static {}, Lcom/umeng/analytics/pro/an;->J()Lcom/umeng/analytics/pro/bp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bp;)V

    .line 860
    iget-object v0, p2, Lcom/umeng/analytics/pro/an;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Ljava/lang/String;)V

    .line 861
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->c()V

    .line 863
    :cond_1
    iget-object v0, p2, Lcom/umeng/analytics/pro/an;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 864
    invoke-static {}, Lcom/umeng/analytics/pro/an;->K()Lcom/umeng/analytics/pro/bp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bp;)V

    .line 865
    iget-object v0, p2, Lcom/umeng/analytics/pro/an;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Ljava/lang/String;)V

    .line 866
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->c()V

    .line 868
    :cond_2
    invoke-static {}, Lcom/umeng/analytics/pro/an;->L()Lcom/umeng/analytics/pro/bp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bp;)V

    .line 869
    iget v0, p2, Lcom/umeng/analytics/pro/an;->d:I

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(I)V

    .line 870
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->c()V

    .line 871
    invoke-static {}, Lcom/umeng/analytics/pro/an;->M()Lcom/umeng/analytics/pro/bp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bp;)V

    .line 872
    iget v0, p2, Lcom/umeng/analytics/pro/an;->e:I

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(I)V

    .line 873
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->c()V

    .line 874
    invoke-static {}, Lcom/umeng/analytics/pro/an;->N()Lcom/umeng/analytics/pro/bp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bp;)V

    .line 875
    iget v0, p2, Lcom/umeng/analytics/pro/an;->f:I

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(I)V

    .line 876
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->c()V

    .line 877
    iget-object v0, p2, Lcom/umeng/analytics/pro/an;->g:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_3

    .line 878
    invoke-static {}, Lcom/umeng/analytics/pro/an;->O()Lcom/umeng/analytics/pro/bp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bp;)V

    .line 879
    iget-object v0, p2, Lcom/umeng/analytics/pro/an;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Ljava/nio/ByteBuffer;)V

    .line 880
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->c()V

    .line 882
    :cond_3
    iget-object v0, p2, Lcom/umeng/analytics/pro/an;->h:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 883
    invoke-static {}, Lcom/umeng/analytics/pro/an;->P()Lcom/umeng/analytics/pro/bp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bp;)V

    .line 884
    iget-object v0, p2, Lcom/umeng/analytics/pro/an;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Ljava/lang/String;)V

    .line 885
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->c()V

    .line 887
    :cond_4
    iget-object v0, p2, Lcom/umeng/analytics/pro/an;->i:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 888
    invoke-static {}, Lcom/umeng/analytics/pro/an;->Q()Lcom/umeng/analytics/pro/bp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bp;)V

    .line 889
    iget-object v0, p2, Lcom/umeng/analytics/pro/an;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Ljava/lang/String;)V

    .line 890
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->c()V

    .line 892
    :cond_5
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/an;->F()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 893
    invoke-static {}, Lcom/umeng/analytics/pro/an;->R()Lcom/umeng/analytics/pro/bp;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/bu;->a(Lcom/umeng/analytics/pro/bp;)V

    .line 894
    iget p2, p2, Lcom/umeng/analytics/pro/an;->j:I

    invoke-virtual {p1, p2}, Lcom/umeng/analytics/pro/bu;->a(I)V

    .line 895
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->c()V

    .line 897
    :cond_6
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->d()V

    .line 898
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/bu;->b()V

    return-void
.end method

.method public synthetic b(Lcom/umeng/analytics/pro/bu;Lcom/umeng/analytics/pro/av;)V
    .locals 0

    .line 732
    check-cast p2, Lcom/umeng/analytics/pro/an;

    invoke-virtual {p0, p1, p2}, Lcom/umeng/analytics/pro/an$a;->a(Lcom/umeng/analytics/pro/bu;Lcom/umeng/analytics/pro/an;)V

    return-void
.end method
