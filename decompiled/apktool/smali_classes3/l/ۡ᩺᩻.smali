.class public final Ll/ۡ᩺᩻;
.super Ljava/lang/Object;
.source "W7A7"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ljava/util/HashMap;

.field public final ܽ:Z

.field public final ܿ:Ljava/util/HashSet;

.field public final ᩳ:Z


# direct methods
.method public constructor <init>(ZLjava/util/HashMap;Ljava/util/HashSet;Ll/᩷᩺᩻;)V
    .locals 0

    .line 1043
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1044
    iput-boolean p1, p0, Ll/ۡ᩺᩻;->ᩳ:Z

    .line 1045
    iput-object p2, p0, Ll/ۡ᩺᩻;->ܳ:Ljava/util/HashMap;

    .line 1046
    iput-object p3, p0, Ll/ۡ᩺᩻;->ܿ:Ljava/util/HashSet;

    .line 1047
    iget-boolean p1, p4, Ll/᩷᩺᩻;->ܽ:Z

    iput-boolean p1, p0, Ll/ۡ᩺᩻;->ܽ:Z

    .line 1048
    iget p1, p4, Ll/᩷᩺᩻;->֫:I

    iput p1, p0, Ll/ۡ᩺᩻;->֫:I

    .line 1049
    iget-object p1, p4, Ll/᩷᩺᩻;->ۧ:Ljava/lang/String;

    iput-object p1, p0, Ll/ۡ᩺᩻;->ۧ:Ljava/lang/String;

    return-void
.end method
