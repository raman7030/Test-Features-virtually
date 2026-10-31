.class public final synthetic Ll/ܶܿ֨;
.super Ljava/lang/Object;
.source "L7ER"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:Ll/۬ܿ֨;


# direct methods
.method public synthetic constructor <init>(Ll/۬ܿ֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶܿ֨;->᩸:Ll/۬ܿ֨;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 318
    iget-object v0, p0, Ll/ܶܿ֨;->᩸:Ll/۬ܿ֨;

    iget v1, v0, Ll/۬ܿ֨;->֡ۧ:I

    .line 319
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, v0, Ll/۬ܿ֨;->ۖۧ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v0, v0, Ll/۬ܿ֨;->ۚۧ:[I

    invoke-static {v0}, Ll/ᩴۗۚ;->֫([I)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    const/4 v1, 0x2

    aput-object v0, v3, v1

    const-string v0, " same_locals_1_stack_item_frame=%d, offset=%d, numstack=%s"

    .line 19
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
