.class public final Ll/᩷֫ܺ;
.super Ljava/lang/Object;
.source "DAUC"


# instance fields
.field public final ֫:[C

.field public final ۧ:I

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    iput-object p1, p0, Ll/᩷֫ܺ;->ܽ:Ljava/lang/String;

    .line 112
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    iput-object p1, p0, Ll/᩷֫ܺ;->֫:[C

    .line 113
    iput p2, p0, Ll/᩷֫ܺ;->ۧ:I

    return-void
.end method
