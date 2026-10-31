.class public final synthetic Ll/ᩴܿ֨;
.super Ljava/lang/Object;
.source "L7ER"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/ۨܽ֨;


# direct methods
.method public synthetic constructor <init>(Ll/ۨܽ֨;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ᩴܿ֨;->᩸:I

    iput-object p1, p0, Ll/ᩴܿ֨;->᩹:Ll/ۨܽ֨;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 2
    iget v0, p0, Ll/ᩴܿ֨;->᩸:I

    .line 4
    iget-object v1, p0, Ll/ᩴܿ֨;->᩹:Ll/ۨܽ֨;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/֨֫֨;

    .line 199
    iget-object v0, v1, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iget v1, v1, Ll/֨֫֨;->ۜۧ:I

    invoke-virtual {v0, v1}, Ll/ۤۧ֨;->֨(I)Ll/ۗۧ֨;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗۧ֨;->ܽ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 0
    :pswitch_0
    check-cast v1, Ll/۬ܿ֨;

    .line 274
    iget v0, v1, Ll/۬ܿ֨;->᩷ۧ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, v1, Ll/۬ܿ֨;->ܺۧ:[I

    .line 275
    invoke-static {v2}, Ll/ᩴۗۚ;->֫([I)Ljava/lang/String;

    move-result-object v2

    iget-object v1, v1, Ll/۬ܿ֨;->ۚۧ:[I

    invoke-static {v1}, Ll/ᩴۗۚ;->֫([I)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    const-string v0, " stack_map_entry:pc=%d numloc=%s  numstack=%s"

    .line 19
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
